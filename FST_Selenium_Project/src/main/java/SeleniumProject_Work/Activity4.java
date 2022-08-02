package SeleniumProject_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

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
        Actions at = new Actions(driver);
        at.sendKeys(Keys.PAGE_DOWN).build().perform(); 
        at.sendKeys(Keys.PAGE_DOWN).build().perform(); 
        at.sendKeys(Keys.PAGE_DOWN).build().perform(); 
        
        WebElement popularCourse = driver.findElement(By.xpath("//div/h3[contains(text(), 'Email Marketing Strategies')]"));
        String s= popularCourse.getText();
        Assert.assertEquals("Email Marketing Strategies" ,s);
        
        System.out.println("Box name is: " + s);
        
        Assert.assertEquals(s, "Email Marketing Strategies");
    }

  @AfterMethod
    public void afterMethod() {
  
        driver.quit();
    }
}

