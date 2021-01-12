package org.leatoki.uiautotest.testcase;

import org.leatoki.uiautotest.init.LoggerInit;
import org.leatoki.uiautotest.operation.ElementOperation;
import org.leatoki.uiautotest.operation.PageOperation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSearchHelloWorld {
    /**
     * HelloWorld测试用例
     *
     * @throws Exception 异常
     */
    @Test
    public static void searchHelloWorld() throws Exception {
        try {
            PageOperation.openUrl("https://www.baidu.com/", "打开百度首页");

            ElementOperation.fluentWaitForSendKey(By.id("kw"), "HelloWorld", "输入HelloWorld");

            ElementOperation.fluentWaitForClick(By.id("su"), "单击百度一下按钮");
        } catch (Exception e) {
            LoggerInit.loggerInit().error(e.getMessage(), e);
            throw e;
        } finally {
            PageOperation.closeBrowse("测试结束");
        }
    }

}
