package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPage extends ParentPage {
    private Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//h1[text()='Alerts']")
    private WebElement alertsTitle;
    @FindBy(xpath = "//button[@id='alertButton']")
    private WebElement alertButton;
    @FindBy(xpath = "//button[@id='timerAlertButton']")
    private WebElement timerAlertButton;
    @FindBy(xpath = "//button[@id='confirmButton']")
    private WebElement confirmButton;
    @FindBy(xpath = "//button[@id='promtButton']")
    private WebElement promptButton;


    public AlertsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getRelativeUrl() {
        return "/alerts";
    }

    public AlertsPage checkIsAlertsTitleVisible() {
        isElementVisible(".main-header");
        return this;
    }

    public AlertsPage clickOnAlertButton() {
        clickOnElement(alertButton);
        return this;
    }


    public AlertsPage clickOnTimerAlertButton() {
        clickOnElement(timerAlertButton);
        return this;
    }

    public AlertsPage checkIsTimerAlertVisible() {
        isElementVisible(timerAlertButton);
        return this;
    }

    public AlertsPage clickOnConfirmButton() {
        clickOnElement(confirmButton);
        return this;
    }

    public AlertsPage clickOnPromptButton() {
        clickOnElement(promptButton);
        return this;
    }

    public AlertsPage waitVisibilityOfElement(int i, String s) {
        waitVisabilityOfElement(i, s);
        return this;
    }

    private final String timerAlertButtonLocator = "//p[@id='timerAlertButton']";

    public String getTimerAlertButtonLocator() {
        return timerAlertButtonLocator;
    }


    public void waitVisabilityOfElement(int i, String s) {
    }

    public void acceptAlert() {
        webDriver.switchTo().alert().accept();
        logger.info("Alert was accepted");
    }

    public AlertsPage acceptAlertWithSendKeys(String keys) {
        webDriver.switchTo().alert().sendKeys(keys);
        webDriver.switchTo().alert().accept();
        return this;
    }

    public AlertsPage getTextFromAlert() {
        webDriver.switchTo().alert().getText();
        return this;
    }

    public Object sendTextToAlert(String s) {
        webDriver.switchTo().alert().sendKeys(s);
        return this;
    }

    public Object waitforAlert(int i) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(i));
        wait.until(ExpectedConditions.alertIsPresent());
        return this;
    }
}
