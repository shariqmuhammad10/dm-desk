package com.atex.features.advance_search;
import com.atex.steps.advance_search_steps.AdvanceSearchSteps;
import com.atex.steps.login_steps.userLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class AdvanceSearchTest {


        //private static final Logger logger = LoggerFactory.getLogger(com.atex.test.features.userLoginTest.class);

        @Managed
        WebDriver driver;


        @Steps
        userLoginSteps userLoginSteps;


        @Steps
        AdvanceSearchSteps advanceSearchSteps;


        @Test

        public void verifyClearAdvanceSearch() {
            userLoginSteps.navigateToLoginPage();
            userLoginSteps.loginIntoSite();
            //userLoginSteps.loginPageToLoad();
            advanceSearchSteps.navigateToAdvanceSearch();
            advanceSearchSteps.clearSearch();
            advanceSearchSteps.pressSearchBtn();
            advanceSearchSteps.verifyAutomatedArticleDisplayed();


        }


}

