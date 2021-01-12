package org.leatoki.uiautotest.operation;

import org.leatoki.uiautotest.init.ActionInit;
import org.leatoki.uiautotest.init.DriverInit;
import org.leatoki.uiautotest.init.LoggerInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * 鼠标键盘操作类
 */
public class ActionOperation {
    /**
     * 显性等待元素加载后鼠标移动到该元素位置
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForMouseMove(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForAllElementsLocated(element, remark);
        ActionInit.actionInit().moveToElement(DriverInit.driver.findElement(element)).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后鼠标移动到该元素位置
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForMouseMove(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForAllElementsLocated(element, remark);
        ActionInit.actionInit().moveToElement(DriverInit.driver.findElement(element)).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后鼠标单击
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForMouseClick(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForElementToBeClick(element, remark);
        ActionInit.actionInit().click(DriverInit.driver.findElement(element)).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后鼠标单击
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void FluentWaitForMouseClick(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        ActionInit.actionInit().click(DriverInit.driver.findElement(element)).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后鼠标双击
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForMouseDoubleClick(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForElementToBeClick(element, remark);
        ActionInit.actionInit().doubleClick(DriverInit.driver.findElement(element)).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后鼠标双击
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void FluentWaitForMouseDoubleClick(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        ActionInit.actionInit().doubleClick(DriverInit.driver.findElement(element)).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后鼠标右键
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForContextClick(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForAllElementsLocated(element, remark);
        ActionInit.actionInit().contextClick(DriverInit.driver.findElement(element)).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后鼠标右键
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForContextClick(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForAllElementsLocated(element, remark);
        ActionInit.actionInit().contextClick(DriverInit.driver.findElement(element)).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后鼠标拖拽
     *
     * @param element 待拖拽元素定位
     * @param target  拖拽至元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForDragAndDrop(By element, By target, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForAllElementsLocated(element, remark);
        WaitOperation.waitForAllElementsLocated(target, remark);
        ActionInit.actionInit().dragAndDrop(DriverInit.driver.findElement(element), DriverInit.driver.findElement(target)).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后鼠标拖拽
     *
     * @param element 待拖拽元素定位
     * @param target  拖拽至元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForDragAndDrop(By element, By target, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForAllElementsLocated(element, remark);
        FluentWaitOperation.fluentWaitForAllElementsLocated(target, remark);
        ActionInit.actionInit().dragAndDrop(DriverInit.driver.findElement(element), DriverInit.driver.findElement(target)).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后键盘按下UP键
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForKeysUp(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForAllElementsLocated(element, remark);
        ActionInit.actionInit().sendKeys(Keys.UP).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后键盘按下UP键
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForKeysUp(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForAllElementsLocated(element, remark);
        ActionInit.actionInit().sendKeys(Keys.UP).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后键盘按下Down键
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForKeysDown(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForAllElementsLocated(element, remark);
        ActionInit.actionInit().sendKeys(Keys.DOWN).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后键盘按下Down键
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForKeysDown(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForAllElementsLocated(element, remark);
        ActionInit.actionInit().sendKeys(Keys.DOWN).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后键盘按下TAB键
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForKeysTab(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForAllElementsLocated(element, remark);
        ActionInit.actionInit().sendKeys(Keys.TAB).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后键盘按下TAB键
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForKeysTab(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForAllElementsLocated(element, remark);
        ActionInit.actionInit().sendKeys(Keys.TAB).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后模拟键盘输入按键
     * Keys.BACK_SPACE 删除键
     * Keys.SPACE 空格键
     * Keys.ESCAPE 回退键
     * Keys.ENTER 回车键
     * Keys.F5 F5
     * Keys.CONTROL,"a" Ctrl+a
     * Keys.CONTROL,"c" Ctrl+c
     *
     * @param element 元素定位
     * @param keys    按键
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForKeysInput(By element, Keys keys, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForAllElementsLocated(element, remark);
        ActionInit.actionInit().sendKeys(keys).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后模拟键盘输入按键
     * Keys.BACK_SPACE 删除键
     * Keys.SPACE 空格键
     * Keys.ESCAPE 回退键
     * Keys.ENTER 回车键
     * Keys.F5 F5
     * Keys.CONTROL,"a" Ctrl+a
     * Keys.CONTROL,"c" Ctrl+c
     *
     * @param element 元素定位
     * @param keys    按键
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForKeysInput(By element, Keys keys, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForAllElementsLocated(element, remark);
        ActionInit.actionInit().sendKeys(keys).perform();
        LoggerInit.loggerInit().info(remark + " End");
    }
}