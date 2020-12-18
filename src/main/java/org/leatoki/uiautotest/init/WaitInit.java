package org.leatoki.uiautotest.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class WaitInit {
    private static WebDriverWait wait;

    /*
     * 初始化 wait 实例
     */
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
        Logger logger = LogManager.getLogger();

        if (wait == null) {
            logger.info("根据配置信息新建显性等待 Start");
            String second = ConfigInit.getProperty("elementWaitSecond");
            long sec = Long.parseLong(second);
            wait = new WebDriverWait(DriverInit.driver, sec == 0 ? 30000 : sec);
            logger.info("根据配置信息新建显性等待 End");
        }

        return wait;
    }
}
