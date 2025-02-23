package org.pages;

import org.openqa.selenium.WebDriver;

public class PageProvider {
    private WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public ElementsPage getElementsPage(){
        return new ElementsPage(webDriver);
    }

    public ButtonsPage getButtonsPage (){ return new ButtonsPage(webDriver); }

    public HomePage getHomePage() {
        return new HomePage(webDriver);
    }

    public LinksPage getLinksPage() {return new LinksPage(webDriver);
    }

    public AlertsPage getAlertsPage() {return new AlertsPage(webDriver);
    }

    public AlertsWindowsPage getAlertsWindowsPage() {return new AlertsWindowsPage(webDriver);
    }
}