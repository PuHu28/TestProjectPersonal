package org.example.tests;

import org.example.pages.AddRemoveElementPage;
import org.example.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElementTest extends BaseTest{
    HomePage homePage = new HomePage(initDriver());
    AddRemoveElementPage elementPage = new AddRemoveElementPage(initDriver());

    @Test
    public void addTest(){
        homePage.clickLink("Add/Remove Elements");
        elementPage.addElement(4);

        List<WebElement> afterDelete = elementPage.getDeleteButtonList();
        Assert.assertTrue(actualSize.size()==4);
    }

    @Test(description = "Add/Remove")
    public void addERemoveAllTest(){
        homePage.clickLink("Add/Remove Elements");
        elementPage.addElement(4);

        List<WebElement> afterDelete = elementPage.getDeleteButtonList();
        Assert.assertTrue(actualSize.size()==4);

        for (WebElement element: actualList){
            element.click();
        }
        List<WebElement> afterDelete = elementPage.getDeleteButtonList();
        Assert.assertTrue(afterDelete.isEmpty());
    }

    @Test
    public void removeTargetElement(){
        homePage.clickLink("Add/Remove Elements");
        elementPage.addElement(6);

        List<WebElement> actualList = elementPage.getDeleteButtonList();
        Assert.assertTrue(actualSiza.size()==6);

        actualList.get(2).click();

        List<WebElement> afterDelete = elementPage.getDeleteButtonList();
        Assert.assertTrue(afterDelete.size()==5);
    }
}
