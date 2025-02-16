package org.availabilityTests;


import org.baseTest.BaseTest;
import org.junit.Test;



public class Availability extends BaseTest {


    @Test
    public void T0001_ElementsAvailabilityHomePage() {
        pageProvider.getLoginPage().openPage();
        pageProvider.getLoginPage().checkIsToolsQaVisible()
                .checkIsSeleniumOnlineTrainingVisible()
                .checkIsElementsBlockVisible()
                .checkIsFormsBlockVisible()
                .checkIsAlertsFrameWindowsBlockVisible()
                .checkIsWidgetsBlockVisible()
                .checkIsInteractionsBlockVisible()
                .checkIsBookStoreApplicationBlockVisible();
    }

    @Test
    public void T0002_ElementsAvailabilityElementsPage() {
        pageProvider.getLoginPage().openPage();
        pageProvider.getLoginPage().checkIsToolsQaVisible()
                .checkIsSeleniumOnlineTrainingVisible()
                .checkIsElementsBlockVisible();

        pageProvider.getLoginPage().clickOnElementsBlock();
        pageProvider.getElementsPage().checkIsElementsBlockVisible()
                .checkIsFormsBlockVisible()
                .checkIsAlertsFrameWindowsBlockVisible()
                .checkIsWidgetsBlockVisible()
                .checkIsInteractionsBlockVisible()
                .checkIsBookStoreApplicationBlockVisible();

        pageProvider.getElementsPage()
                .checkIsTextBoxVisible()
                .checkIsCheckBoxVisible()
                .checkIsRadioButtonVisible()
                .checkIsWebTablesVisible()
                .checkIsButtonsVisible()
                .checkIsLinksVisible()
                .checkIsBrokenLinksImagesVisible()
                .checkIsUploadDownloadVisible()
                .checkIsDynamicPropertiesVisible();
}
}
