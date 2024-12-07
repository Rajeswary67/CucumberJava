package myTestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		//features="Features",
		//features="C:/Users/rajes/eclipse-workspace/CucumberJava/Features/Tagging.feature",
	    features="C:/Users/rajes/eclipse-workspace/CucumberJava/Features/Hooks.feature",
		glue="stepDefinitions",
		//format is replaced by plugin in new cucumber versions
		//here plgin creates xml, json and html format based reports
		plugin= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		dryRun=false,//ensure steps are executed
	    monochrome=true//clean console ouput
	  //tags= "@SanityTest",//Execute only sanity tests
	  //tags= "@SanityTest or @RegressionTest" //also can write as "@SanityTest or @RegressionTest"
	  //tags= "@RegressionTest and @End2End",
	  // tags="@SanityTest or @End2End",
	  //tags= "not @End2End",//this will ignore end2end scenarios
	  //tags= "not @End2End and not @SanityTest" //this will ignore end2end scenarios
	   
		)

public class TestRunner {

}
