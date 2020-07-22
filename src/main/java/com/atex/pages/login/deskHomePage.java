package com.atex.pages.login;

import com.atex.actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

/**
 * Created by omii on 8/17/2016.
 */
public class deskHomePage extends WaitActions {

    @FindBy (id = "btnLogout")
    private WebElementFacade homePageTitle;


    @FindBy (id = "dam-list-list")
    private WebElementFacade articleList;



    @FindBy (css = "div.modal-backdrop.in")
    private WebElementFacade modalArticleVisible;

    @FindBy (css = "a.ng-binding")
    private WebElementFacade logOut;


    @FindBy (css = "a.fullscreen-toggle")
    private WebElementFacade fullScreen;


    @FindBy (linkText = "LEARNING AUTOMATION USING SELENIUM")
    private WebElementFacade articleName;



    @FindBy (css = "button.navbar-toggle.dam-menu-btn.hidden-lg.visible-md.visible-sm.visible-xs")
    private WebElementFacade navigationLeftMenu;

    @FindBy (css = "span.ng-binding.ng-scope")
    private WebElementFacade facetsOption;

    @FindBy (css = "i.fa.fa-user.dam-text-icon")
    private WebElementFacade userDDIcon;

    @FindBy (css = "span.dam-language-select.ng-binding")
    private WebElementFacade languageDropdown;

    @FindBy (id = "dam-refresh-button")
    private WebElementFacade previewRefreshButton;



    public void openLanguageDD(){
        waitUntilLoaded(languageDropdown);
        clickOn(languageDropdown);
    }

    public void openUserDD(){
        waitUntilLoaded(userDDIcon);
        clickOn(userDDIcon);
    }



    public void fullScreenOption(){
        waitUntilLoaded(fullScreen);
        clickOn(fullScreen);
    }


    public boolean homePageIsDisplayed(){
        return fullScreen.isDisplayed();

    }


    public boolean automatedCourseName() {

        waitUntilLoaded(articleName);
        return articleName.isDisplayed();
    }




}
