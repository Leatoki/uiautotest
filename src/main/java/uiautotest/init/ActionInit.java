package uiautotest.init;

import org.openqa.selenium.interactions.Actions;

public class ActionInit {
    /**
     * Action初始化
     *
     * @return Action
     */
    public static Actions actionInit() {
        return new Actions(DriverInit.driver);
    }
}
