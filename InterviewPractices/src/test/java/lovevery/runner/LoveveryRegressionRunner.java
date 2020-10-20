package lovevery.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (features = "src\\test\\resources\\PracticeFeatures" , glue= {"lovevery.stepdefinitions"},

plugin={ "junit: target/cucumber-reports/Cucumber.xml" , "html: target/cucumber-reports/Cucumber.html" , 
		"json: target/cucumber-reports/Cucumber.json"} 

)

public class LoveveryRegressionRunner {

}
