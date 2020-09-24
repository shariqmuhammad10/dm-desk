package com.atex.pages.users.notifications;

import com.atex.actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class NotificationPage extends WaitActions {

    @FindBy(xpath = "//*[@id=\"dam-header\"]/div/div[2]/ul/li[3]/ul/li[1]/a")
    private WebElementFacade notificationOption;


    @FindBy(xpath = "//h4[starts-with(@id,'views-dam-notifications-dialog-')]")
    private WebElementFacade clearButtonForNotification;

    public void clickOnNotificationOption(){
        waitUntilLoaded(notificationOption);
        clickOn(notificationOption);
    }


    public boolean notificationPopupIsvisible() {
        waitUntilLoaded(clearButtonForNotification);
        return clearButtonForNotification.isDisplayed();
    }
}
