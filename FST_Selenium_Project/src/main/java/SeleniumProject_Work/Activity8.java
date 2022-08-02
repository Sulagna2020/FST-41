package SeleniumProject_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {

WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }

    @Test
    public void exampleTestCase() {
  
        driver.findElement(By.xpath("//a[contains(@href, 'contact')]")).click();
        
        Actions at = new Actions(driver);
        at.sendKeys(Keys.PAGE_DOWN).build().perform(); 
        at.sendKeys(Keys.PAGE_DOWN).build().perform(); 
      
       
        
        WebElement fullName = driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_0\"]"));
        WebElement email = driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_1\"]"));
        WebElement subject = driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_3\"]"));
        WebElement comments = driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_2\"]"));
        
        fullName.sendKeys("Tester");
        email.sendKeys("tester@test.com");
        subject.sendKeys("Selenium");
        comments.sendKeys("I would like to take up this course!");
        
        //Submit button-
        driver.findElement(By.id("wpforms-submit-8")).click();
        
        WebElement message = driver.findElement(By.xpath("//div/p[contains(text(),'contacting')]"));
        
        String s = message.getText();
        
        System.out.println("Displayed message is: " + s);
    }
    
  @AfterMethod
    public void afterMethod() {
 
     driver.quit();
   

}
}