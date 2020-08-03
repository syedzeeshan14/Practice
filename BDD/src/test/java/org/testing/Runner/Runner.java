package org.testing.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//, glue= "org.testing.StepDefinitions",
//format = {"pretty", "html:Reports/cucumber-html-report/Report.html"}
@CucumberOptions(features="./Feature")
    
public class Runner {
	
	

}
