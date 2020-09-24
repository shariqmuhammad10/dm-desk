package com.atex.features.UserDD.notification;

import com.atex.steps.advance_search_steps.AdvanceSearchSteps;
import com.atex.steps.create_article_steps.CreateArticleSteps;
import com.atex.steps.login_steps.UserLoginSteps;
import com.atex.steps.userDDsteps.logout_steps.LogoutSteps;
import com.atex.steps.userDDsteps.notification_steps.NotificationSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class NotificationTest  {


    @Managed
    WebDriver driver;


    @Steps
    UserLoginSteps userLoginSteps;


    @Steps
    NotificationSteps notificationSteps;

    @Steps
    LogoutSteps logoutSteps;

    @WithTag(type = "release", name = "smoke-test")

    @Test
    public void checkNotification() {
        userLoginSteps.navigateToLoginPage();
        userLoginSteps.loginIntoSite();
        logoutSteps.openUserDropdown();
        notificationSteps.checkNotification();
        notificationSteps.verifyNotificationPopupIsVisible();

    }
}
