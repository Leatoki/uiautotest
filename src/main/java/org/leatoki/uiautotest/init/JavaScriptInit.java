package org.leatoki.uiautotest.init;

import org.openqa.selenium.JavascriptExecutor;

/**
 * js执行初始化类
 */
public class JavaScriptInit {
    /**
     * js执行初始化
     *
     * @return JavascriptExecutor
     */
    public static JavascriptExecutor javaScriptInit() {
        return (JavascriptExecutor) DriverInit.driver;
    }
}
