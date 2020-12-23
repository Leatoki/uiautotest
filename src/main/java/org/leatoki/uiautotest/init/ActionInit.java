package org.leatoki.uiautotest.init;

import org.openqa.selenium.interactions.Actions;

/**
 * 鼠标键盘操作初始化类
 */
public class ActionInit {
    /**
     * Actions初始化
     *
     * @return Actions
     */
    public static Actions actionInit() {
        return new Actions(DriverInit.driver);
    }
}
