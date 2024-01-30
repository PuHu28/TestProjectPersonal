package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public WebDriver initDriver(){
        if(driver=null){
            System.setProperty("webdriver.chrome.driver","E:\\IDEA Intellij\\IntelliJ IDEA Community Edition 2023.3.1\\TestProjectPersonal\\src\\main\\java\\org\\example\\resourses\\drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
            return driver;
        } else {
            return driver;
        }

        @BeforeClass
                public void openHomePage(){
            driver.get("https://the-internet.herokuapp.com/");
        }

        @AfterClass(alwaysRun = true)
                public void tearDown(){
            driver.quit();
        }

    }
}
