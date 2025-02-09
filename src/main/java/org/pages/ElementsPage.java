package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends ParentPage {
    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    private WebElement toolsQaBlock;

    @FindBy(xpath = "//div[@class='element-group']//descendant::*[text()='Elements']")
    private WebElement elementsBlock;
    @FindBy(xpath = "//div[@class='element-group']//descendant::*[text()='Forms']")
    private WebElement formsBlock;
    @FindBy(xpath = "//div[@class='element-group']//descendant::*[text()='Alerts, Frame & Windows']")
    private WebElement alertsFrameWindowsBlock;
    @FindBy(xpath = "//div[@class='element-group']//descendant::*[text()='Widgets']")
    private WebElement widgetsBlock;
    @FindBy(xpath = "//div[@class='element-group']//descendant::*[text()='Interactions']")
    private WebElement interactionsBlock;
    @FindBy(xpath = "//div[@class='element-group']//descendant::*[text()='Book Store Application']")
    private WebElement bookStoreApplicationBlock;



public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getRelativeUrl() {
        return "/elements";
    }


    public ElementsPage checkIsTextBlockVisible() {
        isElementVisible(".main-header");
        return this;
    }

    public ElementsPage checkIsTextBlockBelowHeaderVisible() {
        isElementVisible(".main-header");
        return this;
    }

    public ElementsPage checkIsTextBoxVisible() {
        isElementVisible("#item-0");
        return this;
    }

    public ElementsPage checkIsCheckBoxVisible() {
        isElementVisible("#item-1");
        return this;
    }

    public ElementsPage checkIsRadioButtonVisible() {
        isElementVisible("#item-2");
        return this;
    }

    public ElementsPage checkIsWebTablesVisible() {
        isElementVisible("#item-3");
        return this;
    }

    public ElementsPage checkIsButtonsVisible() {
        isElementVisible("#item-4");
        return this;
    }

    public ElementsPage checkIsLinksVisible() {
        isElementVisible("#item-5");
        return this;
    }

    public ElementsPage checkIsBrokenLinksImagesVisible() {
        isElementVisible("#item-6");
        return this;
    }

    public ElementsPage checkIsUploadDownloadVisible() {
        isElementVisible("#item-7");
        return this;
    }

    public ElementsPage checkIsDynamicPropertiesVisible() {
        isElementVisible("#item-8");
        return this;
    }



}
