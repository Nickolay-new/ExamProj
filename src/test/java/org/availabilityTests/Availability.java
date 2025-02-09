package org.availabilityTests;


import org.baseTest.BaseTest;
import org.junit.Test;

public class Availability extends BaseTest {

    @Test
    public void T0001_checkAvailability() {
        pageProvider.getLoginPage().openPage();
        pageProvider.getLoginPage().checkIsToolsQaVisible()
                .checkIsSeleniumOnlineTrainingVisible()
                .checkIsTopCardsVisible();

    }


}
