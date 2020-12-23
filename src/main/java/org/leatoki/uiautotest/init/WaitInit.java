package org.leatoki.uiautotest.init;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

/**
 * 显性等待初始化类
 */
public class WaitInit {
    private static WebDriverWait wait;

    static {
        String second;

        try {
            second = ConfigInit.getProperty("elementWaitSecond");
            long sec = Long.parseLong(second);
            wait = new WebDriverWait(DriverInit.driver, sec == 0 ? 30000 : sec);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 显性等待
     *
     * @return wait
     */
    public static WebDriverWait getWait() throws IOException {
        if (wait == null) {
            LoggerInit.loggerInit().info("根据配置信息新建显性等待 Start");
            String second = ConfigInit.getProperty("elementWaitSecond");
            long sec = Long.parseLong(second);
            wait = new WebDriverWait(DriverInit.driver, sec == 0 ? 30000 : sec);
            LoggerInit.loggerInit().info("根据配置信息新建显性等待 End");
        }

        return wait;
    }
}
