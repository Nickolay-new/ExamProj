package org.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CommonActionsWithElements {
    protected WebDriver webDriver;
    private Logger logger = Logger.getLogger(getClass());

    protected WebDriverWait webDriverWait_10, webDriverWait_15;

    public CommonActionsWithElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this); // ініціалізує елементи, описані FindBy
        webDriverWait_10 = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        webDriverWait_15 = new WebDriverWait(webDriver, Duration.ofSeconds(15));
    }

    private String getElementName(WebElement webElement) {
        String elementName;
        try {
            elementName = webElement.getAccessibleName();
        } catch (Exception e) {
            elementName = "";
        }
        return elementName;
    }

    protected void clickOnElement(WebElement webElement) {
        try {
            webDriverWait_10.until(ExpectedConditions.elementToBeClickable(webElement));
            String elementName = getElementName(webElement);
            webElement.click();
            logger.info(elementName + "Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    protected boolean isElementVisible(String locator) {
        try {
            return isElementVisible(webDriver.findElement(By.xpath(locator)));
        } catch (Exception e) {
            logger.info("Element is not found");
            return false;
        }
    }

    protected boolean isElementVisible(WebElement webElement) {
        try {
            boolean state = webElement.isDisplayed();
            if (state) {
                logger.info(getElementName(webElement) + "Element is displayed");
            } else {
                logger.info(getElementName(webElement) + "Element is not displayed");
            }
            return state;
        } catch (Exception e) {
            logger.info("Element is not found");
            return false;
        }
    }

    protected void checkIsElementVisible(WebElement webElement) {
        Assert.assertTrue("Element is not visible", isElementVisible(webElement));
    }

    protected void acceptAlert() {
        try {
            webDriverWait_10.until(ExpectedConditions.alertIsPresent());
            webDriver.switchTo().alert().accept();
            logger.info("Alert was accepted");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    // scroll to element using Actions
    protected void scrollToElement(WebElement webElement) {
        try {
            Actions actions = new Actions(webDriver);
            actions.moveToElement(webElement);
            actions.perform();
            logger.info("Scrolled to element " + getElementName(webElement));
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    private void printErrorAndStopTest(Exception e) {
        logger.error("Cannot work with element " + e);
        Assert.fail("Cannot work with element " + e);
    }

    protected void waitVisabilityOfElement(int i, String s) {
        try {
            webDriverWait_10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s)));
            logger.info("Element is visible");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }
}
