package org.leatoki.uiautotest.operation;

import org.leatoki.uiautotest.init.LoggerInit;
import org.leatoki.uiautotest.init.WaitInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * 显性等待操作类
 */
public class WaitOperation {
    /**
     * Explicit Wait（显性等待）元素加载，当可单击时
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForElementToBeClick(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " 显性等待 " + element + " 加载 Start");
        WaitInit.getWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        LoggerInit.loggerInit().info(remark + " 显性等待 " + element + " 加载 End");
    }

    /**
     * Explicit Wait（显性等待）元素加载，当符合条件的元素加载时
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForElementLocated(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " 显性等待 " + element + " 加载 Start");
        WaitInit.getWait().until(ExpectedConditions.presenceOfElementLocated(element));
        LoggerInit.loggerInit().info(remark + " 显性等待 " + element + " 加载 End");
    }

    /**
     * Explicit Wait（显性等待）元素加载，当符合条件的元素都加载时
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForAllElementsLocated(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " 显性等待 " + element + " 加载 Start");
        WaitInit.getWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        LoggerInit.loggerInit().info(remark + " 显性等待 " + element + " 加载 End");
    }
}
