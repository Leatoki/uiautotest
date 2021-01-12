package org.leatoki.uiautotest.operation;

import org.leatoki.uiautotest.init.FluentWaitInit;
import org.leatoki.uiautotest.init.LoggerInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * 流畅等待操作类
 */
public class FluentWaitOperation {
    /**
     * Fluent Wait（流畅等待）元素加载，当可单击时
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForElementToBeClick(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " 流畅等待 " + element + " 加载 Start");
        FluentWaitInit.getFluentWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        LoggerInit.loggerInit().info(remark + " 流畅等待 " + element + " 加载 End");
    }

    /**
     * Fluent Wait（流畅等待）元素加载，当符合条件的元素加载时
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForElementLocated(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " 流畅等待 " + element + " 加载 Start");
        FluentWaitInit.getFluentWait().until(ExpectedConditions.presenceOfElementLocated(element));
        LoggerInit.loggerInit().info(remark + " 流畅等待 " + element + " 加载 End");
    }

    /**
     * Fluent Wait（流畅等待）元素加载，当符合条件的元素都加载时
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForAllElementsLocated(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " 流畅等待 " + element + " 加载 Start");
        FluentWaitInit.getFluentWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        LoggerInit.loggerInit().info(remark + " 流畅等待 " + element + " 加载 End");
    }
}
