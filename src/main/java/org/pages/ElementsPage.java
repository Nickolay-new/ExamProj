package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends ParentPage {
    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    private WebElement toolsQaBlock;

    /**
     * Left Menu section of the website.
     */
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

    /**
     * Items of the Elements section.
     */
    @FindBy(xpath = "//div[@class='element-list collapse show']//descendant::*[text()='Text Box']")
    private WebElement textBox;
    @FindBy(xpath = "//div[@class='element-list collapse show']//descendant::*[text()='Check Box']")
    private WebElement checkBox;
    @FindBy(xpath = "//div[@class='element-list collapse show']//descendant::*[text()='Radio Button']")
    private WebElement radioButton;
    @FindBy(xpath = "//div[@class='element-list collapse show']//descendant::*[text()='Web Tables']")
    private WebElement webTables;
    @FindBy(xpath = "//div[@class='element-list collapse show']//descendant::*[text()='Buttons']")
    private WebElement buttons;
    @FindBy(xpath = "//div[@class='element-list collapse show']//descendant::*[text()='Links']")
    private WebElement links;
    @FindBy(xpath = "//div[@class='element-list collapse show']//descendant::*[text()='Broken Links - Images']")
    private WebElement brokenLinksImages;
    @FindBy(xpath = "//div[@class='element-list collapse show']//descendant::*[text()='Upload and Download']")
    private WebElement uploadDownload;




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
