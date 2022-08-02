package SeleniumProject_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }

    @Test
    public void exampleTestCase() {
  
        driver.findElement(By.xpath("//a[contains(@href, 'all-courses')]")).click();
        
        driver.findElement(By.xpath("//div/article/a/img")).click();
        
        Actions at = new Actions(driver);
        at.sendKeys(Keys.PAGE_DOWN).build().perform(); 
        at.sendKeys(Keys.PAGE_DOWN).build().perform(); 
        at.sendKeys(Keys.PAGE_DOWN).build().perform(); 

        
        driver.findElement(By.xpath("//div/a[contains(@href, 'developing-strategy')]/div")).click();
        
        String s = driver.getTitle();         
        System.out.println("Course title is: " + s);
        
        Assert.assertEquals("Social Media Marketing – Alchemy LMS" , s);             
        System.out.println("New page headng is: " + s);
        Assert.assertEquals(s, "Social Media Marketing – Alchemy LMS");
        
        
    } 
        @AfterMethod
        public void afterMethod() {
            //Close the browser
            driver.quit();
        }

    }