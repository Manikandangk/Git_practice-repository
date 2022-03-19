package Test_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

(features="Features" , glue = {"Step_Defenition"}
,tags= {"@Regression"},plugin= {"com.cucumber.listener.ExtentCucumberFormatter:Output/AutomationPackReport.html"}

)


public class Runner {

}
