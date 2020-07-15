package com.atex.pages.create_new.development_large_article;

import com.atex.actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DevelopmentLargeArticlePage extends WaitActions {


    @FindBy( id = "dm.desk" )
    private WebElementFacade pageTitle;

    @FindBy( css = "a.ng-binding" )
    private WebElementFacade createNew;

    @FindBy( css = "input.form-control.ng-touched" )
    private WebElementFacade nameField;

    @FindBy( id = "button.btn.btn-link.ng-binding" )
    private WebElementFacade clearBtn;

    @FindBy( id = "span.ng-binding.ng-scope" )
    private WebElementFacade searchBtn;

    @FindBy( css = "i.fa.fa-toggle-down" )
    private WebElementFacade advanceSearchDD;


    public void clickOnAdvanceSearchDD() {
        waitUntilLoaded(advanceSearchDD);
        advanceSearchDD.click();

    }

    public void clearAllSearchCriteria() {
        waitUntilLoaded(clearBtn);
        clearBtn.click();
    }

    public void clickOnSearchBtn() {
        nameField.sendKeys("automation");
        searchBtn.click();
    }

    public void clickOnCreateNewDD() {
        waitUntilLoaded(createNew);
        createNew.click();
    }



    }
