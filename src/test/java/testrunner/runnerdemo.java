package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\LOKESH\\eclipse-workspace\\Logintest\\src\\test\\java\\stepdeftest"
	,glue= {"stepdeftest"
	},plugin= {"pretty", "json:target/cucumber-reports/Cucumber.json"},
			monochrome=true)
	
	

	public class runnerdemo {
		
	}
	
