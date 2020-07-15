package com.atex.pages.advance_search;



import com.atex.actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


public class AdvanceSearchPage extends WaitActions {

    @FindBy(id = "dm.desk")
    private WebElementFacade pageTitle;

    @FindBy(css = "input.form-control.ng-touched")
    private WebElementFacade nameField1;

    @FindBy(xpath = "//*[@id=\"ui-configuration-form\"]/div/div[3]/div/div/div/input")
    private WebElementFacade nameField;


    @FindBy (id = "dam-list-list")
    private WebElementFacade articleList;

    @FindBy(css = "button.btn.btn-link.ng-binding")
    private WebElementFacade clearBtn;

    @FindBy(xpath = "//*[@id=\"advanced-search-btn\"]/span")
    private WebElementFacade searchBtn;

    @FindBy (css = "div.modal-backdrop.in")
    private WebElementFacade modalArticleVisible;

    @FindBy(css = "button#advanced-search.btn.btn-default")
    private WebElementFacade advanceSearchDD;


    public void clickOnAdvanceSearchDD() {

        waitUntilLoaded(advanceSearchDD);
        advanceSearchDD.waitUntilEnabled();
        advanceSearchDD.waitUntilClickable();
        waitFor(articleList);
        //waitOnPage();
        //modalArticleVisible.waitUntilNotVisible();
        waitABit(10000);
        //articleList.waitUntilVisible();
        advanceSearchDD.click();

    }

    public void clearAllSearchCriteria(){
        waitUntilLoaded(clearBtn);
        clearBtn.click();
    }

    public void clickOnSearchBtn(){
        nameField.sendKeys("");
        nameField.click();
        nameField.sendKeys("automation");
        searchBtn.click();
    }




}
