package uiautotest.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;

public class DriverInit {
    public static WebDriver driver;

    /**
     * 谷歌浏览器驱动
     *
     * @return driver
     */
    public static WebDriver chromeDriverinit() {
        Logger logger = LogManager.getLogger();

        logger.info("配置浏览器驱动文件路径 Start");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        logger.info("配置浏览器驱动文件路径 End");

        logger.info("========== 根据驱动是否加载配置参数新建驱动 Start ==========");
        // 获取驱动配置
        if ("1".equals(ConfigInit.getProperty("driveroption"))) {
            try {
                ChromeOptions options = new ChromeOptions();
                HashMap<String, Object> config = new HashMap<>();

                logger.info("初始化驱动配置选项 Start");
                // 设置禁止图片
                config.put("profile.managed_default_content_settings.images", 2);
                // 设置禁止cookies
                config.put("profile.default_content_settings.cookies", 2);
                // 禁止加载js
                config.put("profile.default_content_settings.javascript", 2);
                // 禁止加载css
                config.put("profile.default_content_settings.images", 2);
                // 加载指定插件
                File file = new File("src/main/resources/crx/youtube.crx");
                options.addExtensions(file);
                logger.info("初始化驱动配置选项 End");

                logger.info("添加驱动参数 Start");
                options.setExperimentalOption("prefs", config);
                logger.info("添加驱动参数 End");

                logger.info("根据配置新建驱动 Start");
                driver = new ChromeDriver(options);
                logger.info("根据配置新建驱动 End");
            } catch (Exception e) {
                logger.error("根据驱动参数配置新建驱动失败！");
                e.printStackTrace();
            } finally {
                logger.info("释放驱动 Start");
                driver.quit();
                logger.info("释放驱动 End");
            }
        } else if ("0".equals(ConfigInit.getProperty("driveroption"))) {
            logger.info("无配置新建驱动 Start");
            driver = new ChromeDriver();
            logger.info("无配置新建驱动 End");
        } else {
            logger.error("驱动是否加载配置参数值不支持，请验证！");
        }
        logger.info("========== 根据驱动是否加载配置参数新建驱动 End ==========");

        return driver;
    }
}
