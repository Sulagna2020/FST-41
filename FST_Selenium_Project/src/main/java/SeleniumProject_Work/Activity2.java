package SeleniumProject_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }

    @Test
    public void exampleTestCase() {
    	
    	 WebElement heading = driver.findElement(By.className("uagb-ifb-title"));
    	 String s= heading.getText();
         System.out.println("Page heading is: " + s);
         Assert.assertEquals("Learn from Industry Experts" , s);             
         System.out.println("New page headng is: " + s);
         Assert.assertEquals(s, "Learn from Industry Experts");
     }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}