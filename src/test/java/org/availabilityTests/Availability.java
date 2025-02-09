package org.availabilityTests;


import org.baseTest.BaseTest;
import org.junit.Test;
import org.pages.CommonActionsWithElements;


public class Availability extends BaseTest {

    private Object driver;

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
}


}
