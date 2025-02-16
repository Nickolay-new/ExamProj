package org.elementsTests;

import org.baseTest.BaseTest;
import org.junit.Test;


public class ButtonsTest extends BaseTest {

    @Test
    public void T0003_ButtonsClickOnButtonsPage() {
        pageProvider.getLoginPage().openPage();
        pageProvider.getLoginPage().checkIsToolsQaVisible()
                .checkIsElementsBlockVisible();

        pageProvider.getLoginPage().clickOnElementsBlock();
        pageProvider.getElementsPage().checkIsButtonsVisible();

        pageProvider.getElementsPage().clickOnButtons();


        pageProvider.getButtonsPage().doubleClickOnButton();


    }



}