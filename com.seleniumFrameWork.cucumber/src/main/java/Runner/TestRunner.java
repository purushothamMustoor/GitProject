package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:/SeleAdvanced/com.seleniumFrameWork.cucumber/src/main/java/MyFirstFeatuer"
		//,glue={"E:/SeleAdvanced/com.learnautomation.cucumber/src/main/java/stepDefinations"}
		,glue={"stepDefinations"}
		)
public class TestRunner {

	
}
