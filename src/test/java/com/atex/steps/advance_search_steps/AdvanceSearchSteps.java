package com.atex.steps.advance_search_steps;

import com.atex.pages.advance_search.AdvanceSearchPage;
import com.atex.pages.login.DeskHomePage;
import com.atex.pages.login.DeskLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;



public class AdvanceSearchSteps extends ScenarioSteps {
    private static final Logger logger = LoggerFactory.getLogger(AdvanceSearchSteps.class);


        DeskLoginPage deskLoginPage;
        DeskHomePage deskHomePage;
        AdvanceSearchPage advanceSearchPage;

        @Step
        public void navigateToAdvanceSearch(){
            advanceSearchPage.clickOnAdvanceSearchDD();

        }

        @Step
        public void clearSearch(){
            advanceSearchPage.clearAllSearchCriteria();

        }

        @Step
        public void pressSearchBtn(){
        advanceSearchPage.clickOnSearchBtn();

        }

        @Step
        public void loginIntoSite() {



            String  userNameid = "sysadmin";
            String password = "sysadmin";
            deskLoginPage.loginIntoDesk(userNameid,password);
            assertTrue(deskHomePage.homePageIsDisplayed());
        }


    @Step
    public void verifyAutomatedArticleDisplayed() {
        assertTrue(deskHomePage.automatedCourseName());
    }
}
