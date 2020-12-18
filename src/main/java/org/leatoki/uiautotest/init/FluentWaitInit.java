package org.leatoki.uiautotest.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;
import java.time.Duration;

public class FluentWaitInit {
    private static Wait<WebDriver> fluentwait;

    /*
     * 初始化 fluentwait 实例
     */
    static {
        String FluentWaitMaxSecond;
        String FluentWaitSecond;

        try {
            FluentWaitMaxSecond = ConfigInit.getProperty("FluentWaitMaxSecond");
            FluentWaitSecond = ConfigInit.getProperty("FluentWaitSecond");
            long second = Long.parseLong(FluentWaitMaxSecond);
            long sec = Long.parseLong(FluentWaitSecond);
            fluentwait = new FluentWait<>(DriverInit.driver).withTimeout(Duration.ofSeconds(second))
                    .pollingEvery(Duration.ofSeconds(sec)).ignoring(NoSuchElementException.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 流畅等待
     *
     * @return fluentwait
     */
    public static Wait<WebDriver> getFluentWait() throws IOException {
        Logger logger = LogManager.getLogger();

        if (fluentwait == null) {
            logger.info("根据配置信息新建流畅等待 Start");
            String FluentWaitMaxSecond = ConfigInit.getProperty("FluentWaitMaxSecond");
            String FluentWaitSecond = ConfigInit.getProperty("FluentWaitSecond");
            long second = Long.parseLong(FluentWaitMaxSecond);
            long sec = Long.parseLong(FluentWaitSecond);
            fluentwait = new FluentWait<>(DriverInit.driver).withTimeout(Duration.ofSeconds(second))
                    .pollingEvery(Duration.ofSeconds(sec)).ignoring(NoSuchElementException.class);
            logger.info("根据配置信息新建流畅等待 End");
        }
        return fluentwait;
    }
}
