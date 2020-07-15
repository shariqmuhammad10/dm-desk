package com.atex.pages.login;

import com.atex.actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

/**
 * Created by omii on 8/17/2016.
 */

//@DefaultUrl("")
public class deskLoginPage extends WaitActions {


    @FindBy(id = "dm.desk")
    private WebElementFacade pageTitle;

    @FindBy(css = "div.alert.alert-danger.ng-binding")
    private WebElementFacade unableToLogin;


    @FindBy(id = "usernameInput")
    private WebElementFacade loginName;

    @FindBy(id = "passwordInput")
    private WebElementFacade password;

    @FindBy(css = "button.btn.btn-primary")
    private WebElementFacade loginButton;


    public void loginIntoDesk(String userName, String passwordId) {
        waitUntilLoaded(loginName);
        loginName.clear();
        loginName.sendKeys(userName);

        password.clear();
        password.sendKeys(passwordId);

        waitUntilLoaded(loginButton);
        loginButton.click();

    }

    public boolean verifyPageIsOpen() {
        String pgTitle = getDriver().getTitle();
        String orgPageTitle = "dm.desk";
        //pgTitle = new orgPageTitle("dm.desk");
       System.out.println(pgTitle == orgPageTitle);
        return pageTitle.isDisplayed();

    }
}
