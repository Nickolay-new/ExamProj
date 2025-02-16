package org.availabilityTests;
import org.baseTest.BaseTest;
import org.junit.Test;


public class Availability extends BaseTest {

    @Test
    public void T0001_ElementsAvailabilityHomePage() {
        pageProvider.getHomePage()
                .openPage()
                .checkIsToolsQaVisible()
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
        pageProvider.getHomePage()
                .openPage()
                .checkIsToolsQaVisible()
                .checkIsSeleniumOnlineTrainingVisible()
                .checkIsElementsBlockVisible()
                .scrollToElementsBlock()
                .clickOnElementsBlock();
        pageProvider.getElementsPage()
                .checkIsElementsBlockVisible()
                .checkIsFormsBlockVisible()
                .checkIsAlertsFrameBlockVisible()
                .checkIsWidgetsBlockVisible()
                .checkIsInteractionsBlockVisible()
                .checkIsBookStoreBlockVisible();
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
