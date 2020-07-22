package com.atex.pages.create_new.article;

import com.atex.actions.WaitActions;
import com.github.javafaker.Faker;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

public class ArticlePage extends WaitActions {


    @FindBy(xpath = "//*[@id=\"dam-header\"]/div/div[2]/ul/li[2]/ul/li[1]/a")
    private WebElementFacade articleOption;

    @FindBy(xpath = "//*[@id=\"dam-header\"]/div/div[2]/ul/li[2]/a")
    private WebElementFacade createNewDD;


    @FindBy(xpath = "/html/body/div[1]/section/form/div[2]/onecms-content-editor/div/ul/li[1]/a")
    private WebElementFacade generalTab;


    @FindBy(xpath = "//input[starts-with(@id,'form-control-widget-')]")
    private WebElementFacade articleName;

    @FindBy(css = "a.btn.btn-default.btn-sm.pull-left.ng-binding")
    private WebElementFacade articleCloseButton;


    @FindBy(xpath = "/html/body/div[1]/section/div/div/div[1]/a")
    private WebElementFacade articleSaveButton;

    @FindBy(tagName = "/html/body/div[1]/section/div/div/div[1]/a")
    private WebElementFacade articleSaveButton1;




    //#form-control-widget-


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

    public void setArticleNameFieldValue() {
        articleName.waitUntilVisible();
        articleName.waitUntilPresent();
        articleName.waitUntilClickable();
        //generalTab.click();
        articleName.click();
        articleName.sendKeys("22 June 2020");
        //articleName.sendKeys(getArticleName());
        //String ariticleName =
    }

    Faker faker = new Faker();

    public String setArticleName() {

        String articleNameValue = faker.name().firstName();
        return articleNameValue;

    }

    public void getArticleName() {


    }


    public void saveArticle() {
        articleSaveButton.waitUntilVisible();
        articleSaveButton.waitUntilClickable();
        articleSaveButton.waitUntilEnabled();
        articleSaveButton.click();

    }

    public boolean closeButtonIsVisible() {

        waitUntilLoaded(articleCloseButton);
        return articleCloseButton.isDisplayed();
    }


}
