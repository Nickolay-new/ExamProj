package org.pages;

import org.apache.log4j.Logger;
import org.data.TestData;
import org.openqa.selenium.WebDriver;

public class HomePage extends ParentPage {

    private Logger logger = Logger.getLogger(getClass());

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    protected String getRelativeUrl() {
        return "/";
    }







}
