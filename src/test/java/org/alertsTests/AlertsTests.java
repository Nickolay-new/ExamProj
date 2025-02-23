package org.alertsTests;

import org.baseTest.BaseTest;
import org.junit.Test;


public class AlertsTests extends BaseTest {

    @Test
    public void T0005_AlertsTests() throws InterruptedException {
        pageProvider.getHomePage()
                .openPage()
                .checkIsToolsQaVisible()
                .checkIsSeleniumOnlineTrainingVisible()
                .checkIsElementsBlockVisible()
                .scrollToElementsBlock()
                .clickOnAlertsBlock();
        pageProvider.getAlertsWindowsPage()
                .checkIsAlertsFrameBlockVisible()
                .clickOnAlertsButton();
        pageProvider.getAlertsPage()
                .checkIsAlertsTitleVisible()
                .clickOnAlertButton()
                .getTextFromAlert()
                .acceptAlert();
                pageProvider.getAlertsPage().clickOnTimerAlertButton()
                .waitVisibilityOfElement(5, "//p[@id='timerAlertButton']")
                .checkIsTimerAlertVisible()
                .acceptAlert();
                pageProvider.getAlertsPage().clickOnConfirmButton()
                .acceptAlert();
                pageProvider.getAlertsPage().clickOnPromptButton()
                .sendTextToAlert("Hello, World!");
                pageProvider.getAlertsPage().acceptAlertWithSendKeys("Hello, World!");
    }
}
