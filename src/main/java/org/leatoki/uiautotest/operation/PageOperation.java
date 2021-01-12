package org.leatoki.uiautotest.operation;

import org.leatoki.uiautotest.init.LoggerInit;
import org.openqa.selenium.WebDriver;
import org.leatoki.uiautotest.init.ConfigInit;
import org.leatoki.uiautotest.init.DriverInit;

import java.util.concurrent.TimeUnit;

/**
 * 页面操作类
 */
public class PageOperation {
    /**
     * 启动浏览器并打开网址
     *
     * @param url    测试地址
     * @param remark 备注
     * @throws Exception 异常
     */
    public static void openUrl(String url, String remark) throws Exception {
        WebDriver dr = DriverInit.chromeDriverInit();

        LoggerInit.loggerInit().info("========== 开启谷歌浏览器并打开指定地址：" + url + " Start ==========");

        LoggerInit.loggerInit().info("设置页面最大化 Start");
        dr.manage().window().maximize();
        LoggerInit.loggerInit().info("设置页面最大化 End");

        if ("1".equals(ConfigInit.getProperty("isDeImplicitlyWait"))) {
            LoggerInit.loggerInit().info("设置全局隐性等待时长 Start");
            String secondwait = ConfigInit.getProperty("implicitlyWaitSecond");
            if (secondwait != null && secondwait.length() != 0) {
                long secwait = Long.parseLong(secondwait);
                dr.manage().timeouts().implicitlyWait(secwait, TimeUnit.SECONDS);
            }
            LoggerInit.loggerInit().info("设置全局隐性等待时长 End");
        }

        LoggerInit.loggerInit().info(remark + " Start");
        dr.get(url);
        LoggerInit.loggerInit().info(remark + " End");

        LoggerInit.loggerInit().info("========== 开启谷歌浏览器并打开指定地址：" + url + " End ==========");
    }

    /**
     * 关闭浏览器
     *
     * @param remark 备注
     */
    public static void closeBrowse(String remark) {
        LoggerInit.loggerInit().info(remark + " Start");
        DriverInit.driver.quit();
        LoggerInit.loggerInit().info(remark + " End");
    }
}
