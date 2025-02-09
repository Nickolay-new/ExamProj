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

}
