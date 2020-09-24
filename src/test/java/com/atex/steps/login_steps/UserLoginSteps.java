package com.atex.steps.login_steps;

import com.atex.pages.login.DeskHomePage;
import com.atex.pages.login.DeskLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 * Created by omii on 8/17/2016.
 */
public class UserLoginSteps extends ScenarioSteps {
    private static final Logger logger = LoggerFactory.getLogger(UserLoginSteps.class);


    DeskLoginPage deskLoginPage;
    DeskHomePage deskHomePage;

    @Step
    public void navigateToLoginPage(){

        deskLoginPage.open();
        //assertTrue (aptaLoginPage.verifyPageIsOpen());

        //String  userNameid = "sysadmin";
        //String password = "sysadmin";
        //deskLoginPage.loginIntoDesk(userNameid,password);

    }


    @Step
    public void enterCorrectCredentials(){

        String  userNameid = "sysadmin";
        String password = "sysadmin";
        deskLoginPage.loginIntoDesk(userNameid,password);
        assertTrue(deskHomePage.homePageIsDisplayed());
    }

    @Step
    public void enterInCorrectCredentials(){

        String  userNameid = "sysadmin1";
        String password = "sysadmin1";
        deskLoginPage.loginIntoDesk(userNameid,password);
        //assertTrue(deskHomePage.homePageIsDisplayed());
    }

    @Step
    public void checkFullScreen(){
        deskHomePage.fullScreenOption();
    }




    @Step
    public void loginIntoSite() {

        String  userNameid = "sysadmin";
        String password = "sysadmin";
        deskLoginPage.loginIntoDesk(userNameid,password);
        assertTrue(deskHomePage.homePageIsDisplayed());

    }
    @Step
    public void loginPageToLoad(){
        deskLoginPage.verifyPageIsOpen();
    }



}
