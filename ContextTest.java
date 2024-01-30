package org.example.tests;

import org.example.pages.ContextPage;
import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextTest extends BaseTest{
    private static final String EXPECTED_TEXT
    HomePage homePage = new HomePage(initDriver());
    ContextPage contextPage = new ContextPage(initDriver());

    @Test
    public void contextTest(){
        homePage.clickLink("Context Menu");
        contextPage.manageArea();

        String alertText = contextPage.getAlertText();

        contextPage.confirmAlert();

        Assert.assertEquals(alertText, EXPECTED_TEXT);
    }
}
