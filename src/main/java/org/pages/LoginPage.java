package org.pages;


import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



import java.util.List;

public class LoginPage extends ParentPage {
    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    private WebElement toolsQaBlock;

    @FindBy(xpath = "//img[@class='banner-image' and @src='/images/WB.svg' and @alt='Selenium Online Training']")
    private WebElement seleniumOnlineTrainingBlock;
    @FindBy(xpath = "//div[@class='card mt-4 top-card']")
    private List<WebElement> topCards;
    @FindBy(xpath = "//input[@id='userName' and @placeholder='UserName' and @type='text']")
    private WebElement inputUserName;
    @FindBy(xpath = "//div[@class='card mt-4 top-card' and contains(., 'Elements')]")
    private WebElement elementsBlock;
    @FindBy(xpath = "//div[@class='card mt-4 top-card' and contains(., 'Forms')]")
    private WebElement formsBlock;
    @FindBy(xpath = "//div[@class='card mt-4 top-card' and contains(., 'Alerts, Frame & Windows')]")
    private WebElement alertsFrameWindowsBlock;
    @FindBy(xpath = "//div[@class='card mt-4 top-card' and contains(., 'Widgets')]")
    private WebElement widgetsBlock;
    @FindBy(xpath = "//div[@class='card mt-4 top-card' and contains(., 'Interactions')]")
    private WebElement interactionsBlock;
    @FindBy(xpath = "//div[@class='card mt-4 top-card' and contains(., 'Book Store Application')]")
    private WebElement bookStoreApplicationBlock;


    private Logger logger = Logger.getLogger(getClass());



    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    protected String getRelativeUrl() {
        return "/";
    }

    public LoginPage openPage() {
        webDriver.get(baseUrl);
        logger.info("Login Page was opened with url" + baseUrl);
        return this;
    }

    public LoginPage checkIsToolsQaVisible() {
        checkIsElementVisible(toolsQaBlock);
        return this;
    }

    public LoginPage checkIsSeleniumOnlineTrainingVisible() {
        checkIsElementVisible(seleniumOnlineTrainingBlock);
        return this;
    }

    public LoginPage checkIsTopCardsVisible() {
        for (WebElement topCard : topCards) {
            checkIsElementVisible(topCard);
        }
        return this;
    }

    public LoginPage checkIsElementsBlockVisible() {
        checkIsElementVisible(elementsBlock);
        return this;
    }

    public LoginPage checkIsFormsBlockVisible() {
        checkIsElementVisible(formsBlock);
        return this;
    }

    public LoginPage checkIsAlertsFrameWindowsBlockVisible() {
        checkIsElementVisible(alertsFrameWindowsBlock);
        return this;
    }

    public LoginPage checkIsWidgetsBlockVisible() {
        checkIsElementVisible(widgetsBlock);
        return this;
    }

    public LoginPage checkIsInteractionsBlockVisible() {
        checkIsElementVisible(interactionsBlock);
        return this;
    }

    public LoginPage checkIsBookStoreApplicationBlockVisible() {
        checkIsElementVisible(bookStoreApplicationBlock);
        return this;
    }


}
