package org.pages;

import org.apache.log4j.Logger;
import org.data.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends ParentPage {

    private Logger logger = Logger.getLogger(getClass());

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    protected String getRelativeUrl() {
        return "/";
    }

    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    private WebElement toolsQaBlock;

    @FindBy(xpath = "//img[@class='banner-image' and @src='/images/WB.svg' and @alt='Selenium Online Training']")
    private WebElement seleniumOnlineTrainingBlock;
    @FindBy(xpath = "//div[@class='card mt-4 top-card']")
    private List<WebElement> topCards;







}
