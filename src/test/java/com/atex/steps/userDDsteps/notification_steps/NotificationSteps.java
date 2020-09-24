package com.atex.steps.userDDsteps.notification_steps;

import com.atex.pages.login.DeskHomePage;
import com.atex.pages.login.DeskLoginPage;
import com.atex.pages.users.notifications.NotificationPage;
import com.atex.steps.login_steps.UserLoginSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

public class NotificationSteps extends ScenarioSteps {
    private static final Logger logger = LoggerFactory.getLogger(UserLoginSteps.class);


    DeskLoginPage deskLoginPage;
    DeskHomePage deskHomePage;
    NotificationPage notificationPage;


    @Step
    public void checkNotification(){
    notificationPage.clickOnNotificationOption();

    }

    public void verifyNotificationPopupIsVisible() {
        assertTrue(notificationPage.notificationPopupIsvisible());
    }
}
