package org.leatoki.uiautotest.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 日志初始化类
 */
public class LoggerInit {
    /**
     * 日志初始化
     *
     * @return logger
     */
    public static Logger loggerInit() {
        return LogManager.getLogger();
    }
}
