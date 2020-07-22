package com.atex.steps.create_article_steps;

import com.atex.pages.advance_search.AdvanceSearchPage;
import com.atex.pages.create_new.article.ArticlePage;
import com.atex.steps.advance_search_steps.AdvanceSearchSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

import static org.junit.Assert.assertTrue;

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
    public void storeCurrentWindowHandle(){
        String winHandleBefore = getDriver().getWindowHandle();

    }

    @Step
    public void clickOnArticleOption(){
        articlePage.clickOnArticle();
    }

    @Step
    public void setArticleName1() {
        articlePage.getArticleName();
    }

    @Step
    public void setArticleName() {
        articlePage.setArticleNameFieldValue();
    }


    @Step
    public void getChildWindowHandle() {

        Set<String> allWindows = getDriver().getWindowHandles();
        for(String currentWindow : allWindows){
            getDriver().switchTo().window(currentWindow);
            //getDriver().close();
        }
        //getDriver().manage().window().a

        //getDriver().manage().window();
        //String winHandleBefore = getDriver().getWindowHandle();
    }


    @Step
    public void switchToChildWindow(){
       // Switch to new window opened
        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }
    //("<a href="10.102.10.226:8080/desk/#/">http://www.naukri.com/</a>");
// It will return the parent window name as a String
        //String mainWindow=getDriver().getWindowHandle();
// It returns no. of windows opened by WebDriver and will return Set of Strings
        //Set<String> set =getDriver().getWindowHandles();
// Using Iterator to iterate with in windows
        //Iterator<String> itr= set.iterator();
        //while(itr.hasNext()){
            //String childWindow=itr.next();
// Compare whether the main windows is not equal to child window. If not equal, we will close.
            //if(!mainWindow.equals(childWindow)){
               // driver.switchTo().window(childWindow);



    }

    @Step
    public void clickOnSaveButton() {
        articlePage.saveArticle();

    }

    @Step
    public void verifyArticleCloseButtonIsVisible() {
        assertTrue(articlePage.closeButtonIsVisible());
    }
}
