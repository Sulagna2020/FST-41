package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	
@RunWith(Cucumber.class)
@CucumberOptions(
	
    features = "Features",
    glue = {"stepDefinitions"},
    //tags = "@Activity1"
   // tags = "@Activity2"
     //tags = "@Activity3"
    // tags = "@Activity4"
   // tags = "@SimpleAlert",
    //plugin = {"pretty"},
   // monochrome = true
    tags = "@SimpleAlert",
  //  plugin = {"html: test-reports"},
   // monochrome = true
    plugin = {"json: test-reports/json-report.json"},
    monochrome = true
    )
 
	
public class ActivitiesRunner {
	

}