package org.availabilityTests;
import org.baseTest.BaseTest;
import org.junit.Test;


public class AvailabilityTest extends BaseTest {

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

    @Test
    public void T0004_ElementsAvailabilityLinksPage() {
        pageProvider.getHomePage()
                .openPage()
                .checkIsToolsQaVisible()
                .checkIsSeleniumOnlineTrainingVisible()
                .checkIsElementsBlockVisible()
                .scrollToElementsBlock()
                .clickOnElementsBlock();
        pageProvider.getElementsPage()
                .checkIsLinksVisible()
                .clickOnLinks();
        pageProvider.getLinksPage()
                .checkIsLinksTitleVisible()
                .checkIsHomeLinkVisible()
                .checkIsDynamicLinkVisible()
                .checkIsCreatedLinkVisible()
                .checkIsNoContentLinkVisible()
                .checkIsMovedLinkVisible()
                .checkIsBadRequestLinkVisible()
                .checkIsUnauthorizedLinkVisible()
                .checkIsForbiddenLinkVisible()
                .checkIsNotFoundLinkVisible();
    }
}
