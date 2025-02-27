package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends ParentPage {

    @FindBy(xpath = "//button[@id='doubleClickBtn']")
    private WebElement doubleClickButton;
    @FindBy(xpath = "//button[@id='rightClickBtn']")
    private WebElement rightClickButton;
    @FindBy(xpath = "//button[@type='button' and text()='Click Me']")
    private WebElement clickMeButton;
    @FindBy(xpath = "//p[@id='doubleClickMessage']")
    private WebElement doubleClickMessage;
    @FindBy(xpath = "//p[@id='rightClickMessage']")
    private WebElement rightClickMessage;
    @FindBy(xpath = "//p[@id='dynamicClickMessage']")
    private WebElement dynamicClickMessage;


    public ButtonsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ButtonsPage doubleClickOnButton() {
        Actions actions = new Actions(webDriver);
        actions.doubleClick(doubleClickButton).perform();
        return this;
    }

    public ButtonsPage rightClickOnButton() {
        Actions actions = new Actions(webDriver);
        actions.contextClick(rightClickButton).perform();
        return this;
    }

    public ButtonsPage clickOnButton() {
        Actions actions = new Actions(webDriver);
        actions.click(clickMeButton).perform();
        return this;
    }

    public ButtonsPage checkDoubleClickTextIsVisible() {
        checkIsElementVisible(doubleClickMessage);
        return this;
    }

    public ButtonsPage checkRightClickTextIsVisible() {
        checkIsElementVisible(rightClickMessage);
        return this;
    }

    public ButtonsPage checkIsDynamicClickTextVisible() {
        checkIsElementVisible(dynamicClickMessage);
        return this;
    }

    public ButtonsPage scrollToRightClickButton() {
        scrollToElement(rightClickButton);
        return this;
    }

    public String getRelativeUrl() {
        return "/buttons";
    }
}
