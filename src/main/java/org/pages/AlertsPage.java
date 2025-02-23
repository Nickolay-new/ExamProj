package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends ParentPage {

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

    public AlertsPage checkIsAlertWithTextVisible() {
        isElementVisible("//p[@id='confirmResult']");
        return this;
    }

    public AlertsPage clickOnTimerAlertButton() {
        clickOnElement(timerAlertButton);
        return this;
    }

    public AlertsPage checkIsTimerAlertVisible() {
        isElementVisible("//p[@id='timerAlertButton']");
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

    private void waitVisabilityOfElement(int i, String s) {
    }

    public void acceptAlert() {
        webDriver.switchTo().alert().accept();
    }

    public AlertsPage acceptAlertWithSendKeys(String keys) {
        webDriver.switchTo().alert().sendKeys(keys);
        webDriver.switchTo().alert().accept();
        return this;
    }

    public AlertsPage dismissAlert() {
        webDriver.switchTo().alert().dismiss();
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
}
