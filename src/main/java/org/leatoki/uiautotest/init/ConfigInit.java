package org.leatoki.uiautotest.init;

import java.io.*;
import java.util.Properties;

/**
 * 测试配置参数初始化类
 */
public class ConfigInit {
    /**
     * 获取配置文件配置项值
     *
     * @param config 配置项代码
     * @return 配置项值
     */
    public static String getProperty(String config) throws IOException {
        // 配置文件路径
        String filepath = "src/main/resources/config.properties";
        String property;

        LoggerInit.loggerInit().info("获取 " + config + " 配置信息 Start");
        InputStream in = new BufferedInputStream(new FileInputStream(filepath));
        Properties p = new Properties();
        p.load(in);
        property = p.getProperty(config);
        LoggerInit.loggerInit().info("获取 " + config + " 配置信息 End");

        return property;
    }
}
