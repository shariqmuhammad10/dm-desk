package com.atex.steps.maximize_Screen_steps;

import com.atex.pages.advance_search.AdvanceSearchPage;
import com.atex.pages.create_new.article.ArticlePage;
import com.atex.pages.login.DeskHomePage;
import com.atex.pages.login.DeskLoginPage;
import com.atex.steps.advance_search_steps.AdvanceSearchSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaximizeScreenSteps extends ScenarioSteps {

    private static final Logger logger = LoggerFactory.getLogger(MaximizeScreenSteps.class);


    DeskLoginPage deskLoginPage;
    DeskHomePage deskHomePage;
    AdvanceSearchPage advanceSearchPage;



    @Step
    public void clickOnMaximizeScreenOption(){
        deskHomePage.clickOnMaximizePage();

    }


}
