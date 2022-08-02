package SeleniumProject_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {

WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }

    @Test
    public void exampleTestCase() {
   
        String title = driver.getTitle();         
        System.out.println("Page title is: " + title);
  
        driver.findElement(By.xpath("//a[contains(@href, 'my-account')]")).click();
        String s = driver.getTitle();
        System.out.println("Page title is: " + s);
        Assert.assertEquals("My Account – Alchemy LMS" ,s);
    }

   @AfterMethod
     public void afterMethod() {
  
      driver.quit();
    }
}

