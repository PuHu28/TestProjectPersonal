package org.example.tests;

import org.example.pages.ChallengingDomPage;
import org.example.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChallengingDomTest extends BaseTest{
    HomePage homePage = new HomePage(initDriver());
    ChallengingDomPage challengingDom = new ChallengingDomPage(initDriver());

    @Test
    public void challengeTest(){
        homePage.clickLink("Challenging DOM");

//        challengingDom.pressButton(challengingDom.button);
//        challengingDom.pressButton(challengingDom.alertButton);
//        challengingDom.pressButton(challengingDom.successButton);
        WebElement element challengingDom.getButton(challengingDom.button);
        element.getCssValue("color");

        System.out.println("test");
    }
}
