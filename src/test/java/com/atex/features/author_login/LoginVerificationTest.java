package com.atex.features.author_login;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by SHARIQ MUHAMMAD on 2/6/2020.
 */

@RunWith(SerenityRunner.class)
public class LoginVerificationTest {
    private static final Logger logger = LoggerFactory.getLogger(LoginVerificationTest.class);

    @Managed
    WebDriver driver;


    @Steps
    com.atex.steps.login_steps.userLoginSteps userLoginSteps;

    @Ignore
    @Test
    public void verifyLoginPageIsAppearing() {
        userLoginSteps.navigateToLoginPage();

    }

    @Test
    public void VerifyLoginIntoSite(){

        userLoginSteps.navigateToLoginPage();
        userLoginSteps.enterCorrectCredentials();

    }

    @Test
    public void VerifyUnableToLogin(){

        userLoginSteps.navigateToLoginPage();
        userLoginSteps.enterInCorrectCredentials();


    }

    @Ignore
    @Test
    public void test1(){}

    @Ignore
    @Test
    public void test2(){}


}