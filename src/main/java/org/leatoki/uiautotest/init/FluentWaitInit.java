package org.leatoki.uiautotest.init;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;
import java.time.Duration;

/**
 * 流畅等待初始化类
 */
public class FluentWaitInit {
    private static Wait<WebDriver> fluentwait;

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
     * @throws IOException 异常
     */
    public static Wait<WebDriver> getFluentWait() throws IOException {
        if (fluentwait == null) {
            LoggerInit.loggerInit().info("根据配置信息新建流畅等待 Start");
            String FluentWaitMaxSecond = ConfigInit.getProperty("FluentWaitMaxSecond");
            String FluentWaitSecond = ConfigInit.getProperty("FluentWaitSecond");
            long second = Long.parseLong(FluentWaitMaxSecond);
            long sec = Long.parseLong(FluentWaitSecond);
            fluentwait = new FluentWait<>(DriverInit.driver).withTimeout(Duration.ofSeconds(second))
                    .pollingEvery(Duration.ofSeconds(sec)).ignoring(NoSuchElementException.class);
            LoggerInit.loggerInit().info("根据配置信息新建流畅等待 End");
        }
        return fluentwait;
    }
}
