package org.leatoki.uiautotest.init;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * 驱动初始化类
 */
public class DriverInit {
    public static WebDriver driver;

    /**
     * 谷歌浏览器驱动
     *
     * @return driver
     * @throws IOException 异常
     */
    public static WebDriver chromeDriverinit() throws IOException {
        LoggerInit.loggerInit().info("配置浏览器驱动文件路径 Start");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        LoggerInit.loggerInit().info("配置浏览器驱动文件路径 End");

        LoggerInit.loggerInit().info("========== 根据驱动是否加载配置参数新建驱动 Start ==========");

        // 获取驱动配置
        if ("1".equals(ConfigInit.getProperty("driveroption"))) {
            ChromeOptions options = new ChromeOptions();
            HashMap<String, Object> config = new HashMap<>();

            LoggerInit.loggerInit().info("初始化驱动配置选项 Start");
            // 设置禁止图片
            config.put("profile.managed_default_content_settings.images", 2);
            // 设置禁止cookies
            config.put("profile.default_content_settings.cookies", 2);
            // 禁止加载js
            config.put("profile.default_content_settings.javascript", 2);
            // 禁止加载css
            config.put("profile.default_content_settings.images", 2);
            // 加载指定插件
            File file = new File("src/main/resources/crx/selenium-ide.crx");
            options.addExtensions(file);
            LoggerInit.loggerInit().info("初始化驱动配置选项 End");

            LoggerInit.loggerInit().info("添加驱动参数 Start");
            options.setExperimentalOption("prefs", config);
            LoggerInit.loggerInit().info("添加驱动参数 End");

            LoggerInit.loggerInit().info("根据配置新建驱动 Start");
            driver = new ChromeDriver(options);
            LoggerInit.loggerInit().info("根据配置新建驱动 End");
        } else if ("0".equals(ConfigInit.getProperty("driveroption"))) {
            LoggerInit.loggerInit().info("无配置新建驱动 Start");
            driver = new ChromeDriver();
            LoggerInit.loggerInit().info("无配置新建驱动 End");
        } else {
            LoggerInit.loggerInit().error("驱动是否加载配置参数值不支持，请验证！");
        }

        LoggerInit.loggerInit().info("========== 根据驱动是否加载配置参数新建驱动 End ==========");

        return driver;
    }
}
