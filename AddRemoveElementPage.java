package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElementPage extends BasePage {
    By addButton = By.xpath("//div[@class='example']/button[@onclick='addElement()']");

    By deleteButtonList = By.xpath("//div[@id='elements']/button");

    AddRemoveElementPage(WebDriver driver){
        super(driver);
    }

    public WebElement getAddButton(){
        return driver.findElement(addButton);
    }

    public void addElement (int clickCount) {
        for (int i = 0; i<clickCount; i++) {
            driver.findElement(addButton).click();
        }

    }

    public List<WebElement> getDeleteButtonList(){
        return driver.findElements(deleteButtonList);
    }
}
