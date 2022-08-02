package SeleniumProject_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {

WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }

    @Test
    public void exampleTestCase() {
  
        driver.findElement(By.xpath("//a[contains(@href, 'my-account')]")).click();
        String s = driver.getTitle();
        System.out.println("Page title is: " + s);
        Assert.assertEquals("My Account – Alchemy LMS" ,s);
        
        driver.findElement(By.cssSelector(".ld-login")).click();
        
       WebElement username = driver.findElement(By.id("user_login"));
       WebElement password = driver.findElement(By.id("user_pass"));
        
       username.sendKeys("root");
       password.sendKeys("pa$$w0rd");
        
       driver.findElement(By.id("wp-submit")).click();
       
       WebElement account = driver.findElement(By.xpath("//div/h1[contains(text(), 'My Account')]"));
       String a = account.getText();
       
       System.out.println("Page title is: " + a);
       Assert.assertEquals("My Account" ,a);
       
       System.out.println("Page title is: " + a);
    }

  @AfterMethod
     public void afterMethod() {
  
      driver.quit();
    }

}