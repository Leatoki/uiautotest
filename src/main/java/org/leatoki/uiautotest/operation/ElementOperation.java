package org.leatoki.uiautotest.operation;

import org.leatoki.uiautotest.init.DriverInit;
import org.leatoki.uiautotest.init.LoggerInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

/**
 * 元素操作类
 */
public class ElementOperation {
    /**
     * 登录
     *
     * @param name     用户名定位
     * @param username 用户名
     * @param word     密码定位
     * @param password 密码
     * @param logins   登录按钮定位
     * @param remark   备注
     * @throws Exception 异常
     */
    public static void login(By name, String username, By word, String password, By logins, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        LoggerInit.loggerInit().info("========== 登录系统 Start ==========");

        FluentWaitOperation.fluentWaitForElementToBeClick(logins, remark);

        LoggerInit.loggerInit().info("输入用户名 Start");
        DriverInit.driver.findElement(name).sendKeys(username);
        LoggerInit.loggerInit().info("输入用户名 End");

        LoggerInit.loggerInit().info("输入密码 Start");
        DriverInit.driver.findElement(word).sendKeys(password);
        LoggerInit.loggerInit().info("输入密码 End");

        LoggerInit.loggerInit().info("单击登录按钮 Start");
        DriverInit.driver.findElement(logins).click();
        LoggerInit.loggerInit().info("单击登录按钮 End");

        LoggerInit.loggerInit().info("========== 登录系统 End ==========");
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后单击
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForClick(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForElementToBeClick(element, remark);
        DriverInit.driver.findElement(element).click();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后单击
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForClick(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        DriverInit.driver.findElement(element).click();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后输入
     *
     * @param element 元素定位
     * @param keys    输入内容
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForSendKey(By element, String keys, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForElementToBeClick(element, remark);
        DriverInit.driver.findElement(element).sendKeys(keys);
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后输入
     *
     * @param element 元素定位
     * @param keys    输入内容
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void fluentWaitForSendKey(By element, String keys, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        DriverInit.driver.findElement(element).sendKeys(keys);
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 显性等待元素加载后清空输入内容
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForInputClear(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        WaitOperation.waitForElementToBeClick(element, remark);
        DriverInit.driver.findElement(element).clear();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 流畅等待元素加载后清空输入内容
     *
     * @param element 元素定位
     * @param remark  备注
     */
    public static void fluentWaitForInputClear(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        DriverInit.driver.findElement(element).clear();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 根据页面元素切换Frame
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void switchFrame(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForAllElementsLocated(element, remark);
        WebElement wb = DriverInit.driver.findElement(element);
        DriverInit.driver.switchTo().frame(wb);
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 返回上一级Frame
     *
     * @param remark 备注
     */
    public static void switchParentFrame(String remark) {
        LoggerInit.loggerInit().info(remark + " Start");
        DriverInit.driver.switchTo().parentFrame();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 返回至顶层Frame
     *
     * @param remark 备注
     */
    public static void switchDefaultContent(String remark) {
        LoggerInit.loggerInit().info(remark + " Start");
        DriverInit.driver.switchTo().defaultContent();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 切换窗口
     *
     * @param handle 窗口handle
     * @param remark 备注
     */
    public static void switchWindow(String handle, String remark) {
        LoggerInit.loggerInit().info(remark + " Start");
        DriverInit.driver.switchTo().window(handle);
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 单选选下拉框，根据 Index
     *
     * @param element 元素定位
     * @param index   索引值
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForSelectByIndex(By element, int index, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        Select select = new Select(DriverInit.driver.findElement(element));
        select.selectByIndex(index);
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 单选选下拉框，根据 Value
     *
     * @param element 元素定位
     * @param value   value值
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForSelectByValue(By element, String value, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        Select select = new Select(DriverInit.driver.findElement(element));
        select.selectByValue(value);
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 单选选下拉框，根据 Text
     *
     * @param element 元素定位
     * @param text    文本
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForSelectByText(By element, String text, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        Select select = new Select(DriverInit.driver.findElement(element));
        select.selectByVisibleText(text);
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 多选下拉框，根据 Index
     *
     * @param element 元素定位
     * @param list    多选值列表
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForSelectMultipleIndex(By element, List<Integer> list, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        Select dropList = new Select(DriverInit.driver.findElement(element));
        Assert.assertTrue(dropList.isMultiple());
        for (int a : list) {
            dropList.selectByIndex(a);
        }
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 多选下拉框，根据 Value
     *
     * @param element 元素定位
     * @param list    多选值列表
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForSelectMultipleValue(By element, List<String> list, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        Select dropList = new Select(DriverInit.driver.findElement(element));
        Assert.assertTrue(dropList.isMultiple());
        for (String c : list) {
            dropList.selectByValue(c);
        }
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 多选下拉框，根据 Text
     *
     * @param element 元素定位
     * @param list    多选值列表
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForSelectMultipleText(By element, List<String> list, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        Select dropList = new Select(DriverInit.driver.findElement(element));
        Assert.assertTrue(dropList.isMultiple());
        for (String b : list) {
            dropList.selectByVisibleText(b);
        }
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 下拉框，取消选择
     *
     * @param element 元素定位
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForDeSelectForAll(By element, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        Select select = new Select(DriverInit.driver.findElement(element));
        select.deselectAll();
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 多选下拉框，根据 Index 取消选择
     *
     * @param element 元素定位
     * @param list    多选值列表
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForDeSelectMultipleIndex(By element, List<Integer> list, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        Select dropList = new Select(DriverInit.driver.findElement(element));
        Assert.assertTrue(dropList.isMultiple());
        for (int a : list) {
            dropList.deselectByIndex(a);
        }
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 多选下拉框，根据 Value 取消选择
     *
     * @param element 元素定位
     * @param list    多选值列表
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForDeSelectMultipleValue(By element, List<String> list, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        Select dropList = new Select(DriverInit.driver.findElement(element));
        Assert.assertTrue(dropList.isMultiple());
        for (String c : list) {
            dropList.deselectByValue(c);
        }
        LoggerInit.loggerInit().info(remark + " End");
    }

    /**
     * 多选下拉框，根据 Text 取消选择
     *
     * @param element 元素定位
     * @param list    多选值列表
     * @param remark  备注
     * @throws Exception 异常
     */
    public static void waitForDeSelectMultipleText(By element, List<String> list, String remark) throws Exception {
        LoggerInit.loggerInit().info(remark + " Start");
        FluentWaitOperation.fluentWaitForElementToBeClick(element, remark);
        Select dropList = new Select(DriverInit.driver.findElement(element));
        Assert.assertTrue(dropList.isMultiple());
        for (String b : list) {
            dropList.deselectByVisibleText(b);
        }
        LoggerInit.loggerInit().info(remark + " End");
    }
}
