package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChallengingDomPage extends BasePage{
    private By answerPayload = By.xpath("canvas[@id='canvas']");
    public By button = By.xpath("//div[@class='large-2 columns']/a[@class='button']");
    public By alertButton = By.xpath("//div[@class='large-2 columns']/a[@class='button alert']");
    public By successButton = By.xpath("//div[@class='large-2 columns']/a[@class='button success']");

    public String getAnswer(){
        return driver.findElement(answerPayload).getText();
    }
    public class ChallengingDomPage(WebDriver driver) {
        super(driver);
    }

    public By getAnswerPayload(){
        return answerPayload;
    }
    public void pressButton(By locator){
    }
    public WebElement getButton(By locator){
        return driver.findElement(locator);
    }
}
