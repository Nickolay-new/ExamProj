package org.pages;

import org.openqa.selenium.WebDriver;

public class PageProvider {
    private WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public HomePage getHomePage(){
        return new HomePage(webDriver);
    }
    public ElementsPage getElementsPage(){
        return new ElementsPage(webDriver);
    }

    public ButtonsPage getButtonsPage (){ return new ButtonsPage(webDriver); }

    public LoginPage getLoginPage() {
        return new LoginPage(webDriver);
    }
}