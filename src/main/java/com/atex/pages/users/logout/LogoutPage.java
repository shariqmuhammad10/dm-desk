package com.atex.pages.users.logout;

import com.atex.actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;



public class LogoutPage extends WaitActions {

    @FindBy(xpath = "//*[@id=\"dam-header\"]/div/div[2]/ul/li[3]/ul/li[8]/a")
    private WebElementFacade logoutOption;



    public void clickOnLogoutOption(){
        waitUntilLoaded(logoutOption);
        clickOn(logoutOption);
    }


    public void clickOnUserDropdown() {

    }
}


