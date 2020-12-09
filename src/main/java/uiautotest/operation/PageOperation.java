package uiautotest.operation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import uiautotest.init.ConfigInit;
import uiautotest.init.DriverInit;

import java.util.concurrent.TimeUnit;

public class PageOperation {
    /**
     * 启动浏览器并打开网址
     *
     * @param url 测试地址
     */
    public static void openUrl(String url) {
        Logger logger = LogManager.getLogger();
        WebDriver dr = DriverInit.chromeDriverinit();

        logger.info("========== 开启谷歌浏览器并打开指定地址：" + url + " Start ==========");

        logger.info("打开页面 Start");
        dr.get(url);
        logger.info("打开页面 End");

        logger.info("设置页面最大化 Start");
        dr.manage().window().maximize();
        logger.info("设置页面最大化 End");

        try {
            logger.info("设置全局隐性等待时长 Start");
            String secondwait = ConfigInit.getProperty("implicitlyWaitSecond");
            if (secondwait != null && secondwait.length() != 0) {
                long secwait = Long.parseLong(secondwait);
                dr.manage().timeouts().implicitlyWait(secwait, TimeUnit.SECONDS);
            }
            logger.info("设置全局隐性等待时长 End");
        } catch (Exception e) {
            logger.error("设置全局隐性等待时长失败！");
            e.printStackTrace();
        }

        try {
            logger.info("设置页面加载等待时长 Start");
            String secondpage = ConfigInit.getProperty("pageLoadTimeoutSecond");
            if (secondpage != null && secondpage.length() != 0) {
                long secpage = Long.parseLong(secondpage);
                dr.manage().timeouts().pageLoadTimeout(secpage, TimeUnit.SECONDS);
            }
            logger.info("设置页面加载等待时长 End");
        } catch (Exception e) {
            logger.error("设置页面加载等待时长失败！");
            e.printStackTrace();
        }

        logger.info("========== 开启谷歌浏览器并打开指定地址：" + url + " End ==========");
    }

    /**
     * 关闭浏览器并释放driver
     */
    public static void closeBrowse() {
        Logger logger = LogManager.getLogger();

        logger.info("========== 关闭浏览器并释放driver Start ==========");

        logger.info("关闭页面 Start");
        DriverInit.driver.close();
        logger.info("关闭页面 End");

        logger.info("释放驱动 Start");
        DriverInit.driver.quit();
        logger.info("释放驱动 End");

        logger.info("========== 关闭浏览器并释放driver End ==========");
    }
}
