package com.atex.steps.create_article_steps;

import com.atex.pages.advance_search.AdvanceSearchPage;
import com.atex.pages.create_new.article.ArticlePage;
import com.atex.steps.advance_search_steps.AdvanceSearchSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateArticleSteps extends ScenarioSteps {
    private static final Logger logger = LoggerFactory.getLogger(AdvanceSearchSteps.class);


    com.atex.pages.login.deskLoginPage deskLoginPage;
    com.atex.pages.login.deskHomePage deskHomePage;
    AdvanceSearchPage advanceSearchPage;
    ArticlePage articlePage;

    @Step
    public void navigateToCreateNew(){
        articlePage.clickOnCreateNewDD();

    }

    @Step
    public void clickOnArticleOption(){
        articlePage.clickOnArticle();
    }


    public void clickOnArticleFieldName() {
        articlePage.setArticleName();
    }
}
