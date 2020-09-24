package com.atex.features.article;
import com.atex.steps.advance_search_steps.AdvanceSearchSteps;
import com.atex.steps.create_article_steps.CreateArticleSteps;
import com.atex.steps.login_steps.UserLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



@RunWith(SerenityRunner.class)

public class ArticleTest {


    @Managed
    WebDriver driver;


    @Steps
    UserLoginSteps userLoginSteps;

    @Steps
    AdvanceSearchSteps advanceSearchSteps;

    @Steps
    CreateArticleSteps createArticleSteps;

    @WithTag(type = "release", name = "smoke-test")
    @Test

    public void createNewArticle() {
        userLoginSteps.navigateToLoginPage();   
        userLoginSteps.loginIntoSite();
        //userLoginSteps.loginPageToLoad();
        createArticleSteps.storeCurrentWindowHandle();
        createArticleSteps.navigateToCreateNew();
        createArticleSteps.clickOnArticleOption();
        //createArticleSteps.clickOnArticleFieldName();
        createArticleSteps.storeCurrentWindowHandle();
        createArticleSteps.getChildWindowHandle();

        //createArticleSteps.setArticleName1();  //setting the Faker name
        createArticleSteps.setArticleName();
        createArticleSteps.clickOnSaveButton();
        createArticleSteps.verifyArticleCloseButtonIsVisible();
        //createArticleSteps.switchToChildWindow()

        //advanceSearchSteps.pressSearchBtn();
        //advanceSearchSteps.verifyAutomatedArticleDisplayed();


    }

}
