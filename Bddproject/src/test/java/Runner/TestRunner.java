
package Runner;
import org.junit.runner.RunWith;




import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "StepDefinitions")
public class TestRunner  {

}


