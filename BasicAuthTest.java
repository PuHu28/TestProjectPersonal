package org.example.tests;

import org.example.pages.BasicAuthPage;
import org.example.pages.HomePage;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest{
    HomePage homePage = new HomePage(initDriver());
    BasicAuthPage authPage = new BasicAuthPage(initDriver());

    @Test
    public void basicAuthPage(){
        homePage.clickLink("Basic Auth");
        authPage.login("admin", "admin");
        System.out.println("Debug");
    }

}
