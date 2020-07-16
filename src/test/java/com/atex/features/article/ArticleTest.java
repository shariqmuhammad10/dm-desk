package com.atex.features.article;
import com.atex.steps.advance_search_steps.AdvanceSearchSteps;
import com.atex.steps.create_article_steps.CreateArticleSteps;
import com.atex.steps.login_steps.userLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



@RunWith(SerenityRunner.class)

public class ArticleTest {


    @Managed
    WebDriver driver;


    @Steps
    userLoginSteps userLoginSteps;

    @Steps
    AdvanceSearchSteps advanceSearchSteps;

    @Steps
    CreateArticleSteps createArticleSteps;


    @Test

    public void createNewArticle() {
        userLoginSteps.navigateToLoginPage();
        userLoginSteps.loginIntoSite();
        //userLoginSteps.loginPageToLoad();
        createArticleSteps.navigateToCreateNew();
        createArticleSteps.clickOnArticleOption();
        createArticleSteps.clickOnArticleFieldName();



        //advanceSearchSteps.pressSearchBtn();
        //advanceSearchSteps.verifyAutomatedArticleDisplayed();


    }

}
