package uiautotest.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Properties;

public class ConfigInit {
    /**
     * 获取配置文件配置项值
     *
     * @param config 配置项代码
     * @return 配置项值
     */
    public static String getProperty(String config) {
        Logger logger = LogManager.getLogger();

        // 配置文件路径
        String filepath = "src/main/resources/config.properties";
        String property = null;

        try {
            logger.info("获取 " + config + " 配置信息 Start");
            InputStream in = new BufferedInputStream(new FileInputStream(filepath));
            Properties p = new Properties();
            p.load(in);
            property = p.getProperty(config);
            logger.info("获取 " + config + " 配置信息 End");
        } catch (IOException e) {
            logger.error("获取" + config + "配置信息失败！");
            e.printStackTrace();
        }

        return property;
    }
}
