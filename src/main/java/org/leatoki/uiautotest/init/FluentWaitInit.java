package org.leatoki.uiautotest.init;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

/**
 * 流畅等待初始化类
 */
public class FluentWaitInit {
    private static Wait<WebDriver> fluentWait;

    static {
        String FluentWaitMaxSecond;
        String FluentWaitSecond;

        try {
            FluentWaitMaxSecond = ConfigInit.getProperty("fluentWaitMaxSecond");
            FluentWaitSecond = ConfigInit.getProperty("fluentWaitSecond");
            long second = Long.parseLong(FluentWaitMaxSecond);
            long sec = Long.parseLong(FluentWaitSecond);
            fluentWait = new FluentWait<>(DriverInit.driver).withTimeout(Duration.ofSeconds(second))
                    .pollingEvery(Duration.ofSeconds(sec)).ignoring(NoSuchElementException.class);
        } catch (Exception e) {
            LoggerInit.loggerInit().error(e.getMessage(), e);
        }
    }

    /**
     * 流畅等待
     *
     * @return fluentwait
     * @throws Exception 异常
     */
    public static Wait<WebDriver> getFluentWait() throws Exception {
        if (fluentWait == null) {
            LoggerInit.loggerInit().info("根据配置信息新建流畅等待 Start");
            String FluentWaitMaxSecond = ConfigInit.getProperty("fluentWaitMaxSecond");
            String FluentWaitSecond = ConfigInit.getProperty("fluentWaitSecond");
            long second = Long.parseLong(FluentWaitMaxSecond);
            long sec = Long.parseLong(FluentWaitSecond);
            fluentWait = new FluentWait<>(DriverInit.driver).withTimeout(Duration.ofSeconds(second))
                    .pollingEvery(Duration.ofSeconds(sec)).ignoring(NoSuchElementException.class);
            LoggerInit.loggerInit().info("根据配置信息新建流畅等待 End");
        }

        return fluentWait;
    }
}
