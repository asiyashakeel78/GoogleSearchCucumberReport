package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
plugin ="json:target/cucumber.json",
features = "src/main/resources/Feature" ,
glue = "coscosearchStepDef",
dryRun = false,
monochrome =true

)


public class Runner extends AbstractTestNGCucumberTests{

}
