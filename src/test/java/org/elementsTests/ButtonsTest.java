package org.elementsTests;
import org.baseTest.BaseTest;
import org.junit.Test;


public class ButtonsTest extends BaseTest {

    @Test
    public void T0003_ButtonsClickOnButtonsPage() {
        pageProvider.getHomePage().openPage();
        pageProvider.getHomePage()
                .checkIsToolsQaVisible()
                .checkIsElementsBlockVisible()
                .scrollToElementsBlock()
                .clickOnElementsBlock();
        pageProvider.getElementsPage()
                .checkIsButtonsVisible()
                .clickOnButtons();
        pageProvider.getButtonsPage()
                .doubleClickOnButton()
                .checkDoubleClickTextIsVisible()
                .scrollToRightClickButton()
                .rightClickOnButton()
                .checkRightClickTextIsVisible()
                .clickOnButton()
                .checkIsDynamicClickTextVisible();
    }
}