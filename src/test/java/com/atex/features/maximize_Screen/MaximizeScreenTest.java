package com.atex.features.maximize_Screen;


import com.atex.steps.login_steps.UserLoginSteps;
import com.atex.steps.maximize_Screen_steps.MaximizeScreenSteps;
import com.atex.steps.userDDsteps.notification_steps.NotificationSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MaximizeScreenTest {


    @Managed
    WebDriver driver;


    @Steps
    UserLoginSteps userLoginSteps;


    @Steps
    NotificationSteps notificationSteps;

    @Steps
    MaximizeScreenSteps maximizeScreenSteps;

    @WithTag(type = "release", name = "smoke-test")

    @Test
    public void maximizeScreen(){
        userLoginSteps.navigateToLoginPage();
        userLoginSteps.loginIntoSite();
        maximizeScreenSteps.clickOnMaximizeScreenOption();

    }
















}
