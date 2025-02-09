package org.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

abstract public class ParentPage extends CommonActionsWithElements {
    protected String baseUrl = "https://demoqa.com/";

    public ParentPage(WebDriver webDriver) {
        super(webDriver);
    }

    abstract protected String getRelativeUrl();

    protected void checkUrl() {
        Assert.assertEquals("URL is not expected", baseUrl + getRelativeUrl(), webDriver.getCurrentUrl());
    }


    protected void checkUrlWithPattern() {
        Assert.assertTrue("URL is not expected" + "Expected URL: " + baseUrl + getRelativeUrl() + "Actual URL: " + webDriver.getCurrentUrl(),
                webDriver.getCurrentUrl().matches(baseUrl + getRelativeUrl()));
    }
}
