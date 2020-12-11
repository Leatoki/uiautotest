package org.leatoki.uiautotest.operation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.leatoki.uiautotest.init.ConfigInit;
import org.leatoki.uiautotest.init.DriverInit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PageOperation {
    /**
     * 启动浏览器并打开网址
     *
     * @param url 测试地址
     */
    public static void openUrl(String url) throws IOException {
        Logger logger = LogManager.getLogger();
        WebDriver dr = DriverInit.chromeDriverinit();

        logger.info("========== 开启谷歌浏览器并打开指定地址：" + url + " Start ==========");

        logger.info("设置页面最大化 Start");
        dr.manage().window().maximize();
        logger.info("设置页面最大化 End");

        if ("1".equals(ConfigInit.getProperty("isdeimplicitlywait"))) {
            logger.info("设置全局隐性等待时长 Start");
            String secondwait = ConfigInit.getProperty("implicitlywaitsecond");
            if (secondwait != null && secondwait.length() != 0) {
                long secwait = Long.parseLong(secondwait);
                dr.manage().timeouts().implicitlyWait(secwait, TimeUnit.SECONDS);
            }
            logger.info("设置全局隐性等待时长 End");
        }

        logger.info("打开页面 Start");
        dr.get(url);
        logger.info("打开页面 End");

        logger.info("========== 开启谷歌浏览器并打开指定地址：" + url + " End ==========");
    }

    /**
     * 关闭浏览器
     */
    public static void closeBrowse() {
        Logger logger = LogManager.getLogger();

        logger.info("========== 关闭浏览器 Start ==========");
        DriverInit.driver.quit();
        logger.info("========== 关闭浏览器 End ==========");
    }
}
