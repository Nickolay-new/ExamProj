package org.pages;

import org.openqa.selenium.WebDriver;

public class LinksPage extends ParentPage {
    public LinksPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getRelativeUrl() {
        return "/links";
    }

    public Object checkIsLinksBlockVisible() {
        return isElementVisible(".main-header");
    }
}
