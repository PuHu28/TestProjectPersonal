package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends BasePage{
    public By checkbox1 = By.xpath("");
    public By checkbox2 = By.xpath("");

    By allCheckboxes = By.xpath("//form")

    public void manageCheckbox(By checkbox){
        driver.findElement(checkbox).click();
    }

    public boolean isChecked(By checkbox){
        driver.findElement(checkbox).isSelected();

    }

    public CheckboxesPage(WebDriver driver){
        super(driver);
    }
    public void selectAll(){
        List<WebElement> checkboxes = driver.findElements(allCheckboxes);
        for (WebElement element : checkboxes
        ){
            if (!element.isSelected()){
                element.click();
            }
        }
    }

    public void uncheckAll(){
        List<WebElement> checkboxes = driver.findElements(allCheckboxes);
        for (WebElement element : checkboxes
        ){
            if (element.isSelected()){
                element.click();
            }
        }
    }
}
