package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsWindowsPage extends ParentPage {

    @FindBy(xpath = "//div[@class='element-group'][3]")
    private WebElement alertsFrameBlock;

    @FindBy(xpath = "//div[@class='element-group'][3]//descendant::*[text()='Alerts']")
    private WebElement alertsButton;

    @FindBy(xpath = "//div[@class='element-group'][3]//descendant::*[text()='Browser Windows']")
    private WebElement browserWindowsButton;

    @FindBy(xpath = "//div[@class='element-group'][3]//descendant::*[text()='Frames']")
    private WebElement framesButton;

    @FindBy(xpath = "//div[@class='element-group'][3]//descendant::*[text()='Modal Dialogs']")
    private WebElement modalDialogsButton;

    @FindBy(xpath = "//div[@class='element-group'][3]//descendant::*[text()='Nested Frames']")
    private WebElement nestedFramesButton;
    public AlertsWindowsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AlertsWindowsPage checkIsAlertsFrameBlockVisible() {
        isElementVisible(alertsFrameBlock);
        return this;
    }

    public String getRelativeUrl() {
        return "/alerts";
    }

    public void clickOnAlertsButton() {
        clickOnElement(alertsButton);
    }
}
