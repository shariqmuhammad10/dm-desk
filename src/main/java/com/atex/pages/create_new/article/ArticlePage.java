package com.atex.pages.create_new.article;

import com.atex.actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

public class ArticlePage extends WaitActions {



    @FindBy(xpath = "//*[@id=\"dam-header\"]/div/div[2]/ul/li[2]/ul/li[1]/a")
    private WebElementFacade articleOption;

    @FindBy(xpath = "//*[@id=\"dam-header\"]/div/div[2]/ul/li[2]/a")
    private WebElementFacade createNewDD;


    @FindBy(xpath = "//*[@id=\"form-control-widget-7C2F1\"]")
    private WebElementFacade articleName;



    public void clickOnCreateNewDD() {

        waitUntilLoaded(createNewDD);
        createNewDD.waitUntilEnabled();
        createNewDD.waitUntilClickable();
        waitFor(createNewDD);
        waitABit(10000);
        //articleList.waitUntilVisible();
        createNewDD.click();

    }


    public void clickOnArticle() {
        waitUntilLoaded(articleOption);
        articleOption.waitUntilPresent();
        articleOption.waitUntilVisible();
        articleOption.waitUntilClickable();
        articleOption.click();
        waitABit(20000);
    }

    public void setArticleName() {
        articleName.waitUntilVisible();
        articleName.waitUntilPresent();
        articleName.waitUntilClickable();
        articleName.click();
        articleName.sendKeys("16 July Automation");

    }
}
