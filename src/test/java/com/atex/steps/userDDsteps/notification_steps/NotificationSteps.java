package com.atex.steps.userDDsteps.notification_steps;

import com.atex.pages.login.DeskHomePage;
import com.atex.pages.login.DeskLoginPage;
import com.atex.steps.login_steps.userLoginSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationSteps extends ScenarioSteps {
    private static final Logger logger = LoggerFactory.getLogger(userLoginSteps.class);


    DeskLoginPage deskLoginPage;
    DeskHomePage deskHomePage;


    @Step
    public void logoutToApplication(){


    }

}
