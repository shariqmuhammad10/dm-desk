package com.atex.steps.userDDsteps.logout_steps;

import com.atex.pages.login.DeskHomePage;
import com.atex.pages.login.DeskLoginPage;
import com.atex.pages.users.logout.LogoutPage;
import com.atex.steps.login_steps.userLoginSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogoutSteps extends ScenarioSteps {
    private static final Logger logger = LoggerFactory.getLogger(LogoutSteps.class);


    DeskLoginPage deskLoginPage;
    DeskHomePage deskHomePage;
    LogoutPage logoutPage;

    @Step
    public  void logOutFromApplication(){
        logoutPage.clickOnLogoutOption();

    }

    @Step
    public void openUserDropdown(){
           deskHomePage.clickOnUserDD();
    }


}
