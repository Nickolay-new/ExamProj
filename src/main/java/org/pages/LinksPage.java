package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinksPage extends ParentPage {

    @FindBy(xpath = "//h1")
    private WebElement linksTitle;

    @FindBy(xpath = "//a[@id='simpleLink']")
    private WebElement homeLink;

    @FindBy(xpath = "//a[@id='dynamicLink']")
    private WebElement dynamicLink;

    @FindBy(xpath = "//a[@id='created']")
    private WebElement createdLink;


    @FindBy(xpath = "//a[@id='no-content']")
    private WebElement noContentLink;

    @FindBy(xpath = "//a[@id='moved']")
    private WebElement movedLink;

    @FindBy(xpath = "//a[@id='bad-request']")
    private WebElement badRequestLink;

    @FindBy(xpath = "//a[@id='unauthorized']")
    private WebElement unauthorizedLink;

    @FindBy(xpath = "//a[@id='forbidden']")
    private WebElement forbiddenLink;

    @FindBy(xpath = "//a[@id='invalid-url']")
    private WebElement notFoundLink;


    public LinksPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getRelativeUrl() {
        return "/links";
    }

    public LinksPage checkIsLinksTitleVisible() {
       checkIsElementVisible(linksTitle);
         return this;
    }

    public LinksPage checkIsHomeLinkVisible() {
        checkIsElementVisible(homeLink);
        return this;
    }

    public LinksPage checkIsDynamicLinkVisible() {
        checkIsElementVisible(dynamicLink);
        return this;
    }

    public LinksPage checkIsCreatedLinkVisible() {
        checkIsElementVisible(createdLink);
        return this;
    }

    public LinksPage checkIsNoContentLinkVisible() {
        checkIsElementVisible(noContentLink);
        return this;

    }

    public LinksPage checkIsMovedLinkVisible() {
        checkIsElementVisible(movedLink);
        return this;
    }

    public LinksPage checkIsBadRequestLinkVisible() {
        checkIsElementVisible(badRequestLink);
        return this;
    }

    public LinksPage checkIsUnauthorizedLinkVisible() {
        checkIsElementVisible(unauthorizedLink);
        return this;
    }

    public LinksPage checkIsForbiddenLinkVisible() {
        checkIsElementVisible(forbiddenLink);
        return this;
    }

    public LinksPage checkIsNotFoundLinkVisible() {
        checkIsElementVisible(notFoundLink);
        return this;

    }
}
