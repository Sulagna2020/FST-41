package SeleniumProject_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {

WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }

    @Test
    public void exampleTestCase() {
  
        driver.findElement(By.xpath("//a[contains(@href, 'all-courses')]")).click();
        
        int courseCount = driver.findElements(By.className("entry-title")).size();
        
        System.out.println("Number of courses are: " + courseCount);
    }
    @AfterMethod
    public void afterMethod() {
 
     driver.quit();
   }

}