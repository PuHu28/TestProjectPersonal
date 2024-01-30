package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextPage extends BasePage{
    Actions actions = new Actions(driver) {
        By contextArea = By.xpath("");

        public ContextPage(WebDriver driver){
            super(driver);
        }

        public void manageArea(){
            actions.contextClick(driver.findElement(contextArea)).build().perform();
            actions.

        }

        public String getAlertText(){
            return driver.switchTo().alert().getText();

        }

        public void confirmAlert(){
            driver.switchTo().alert().accept();
        }
    }
}
