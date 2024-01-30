package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    private String homeURL = "https://the-internet.herokuapp.com/";
    private static String LINK_PATTERN = "//ul/li/a[text()='%s']";

    public void clickLink(String LinkName){
        driver.findElement(By.xpath(String.format(LINK_PATTERN, LinkName))).click();
    }
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
}
