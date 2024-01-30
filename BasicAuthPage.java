package org.example.pages;

import org.openqa.selenium.WebDriver;

public class BasicAuthPage extends BasePage{
    protected WebDriver driver;
    public void login (String username, String password){
        driver.switchTo().activeElement().sendKeys(username);
    }

    public BasicAuthPage(WebDriver driver){
        super(driver);
    }
}
