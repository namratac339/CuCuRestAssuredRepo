package com.basic1.basic.getWithTagsOfCucuSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
			
			
//			tags={"@Important"}, //All scenario executed if this is tag for feature file
			 //tags={"@Smoke"}, //only tag with @smoke
			tags={"@Smoke","@Regression"}, //AND condition
			 //tags={"@Smoke,@Regression"} , // OR condiction
			//tags={"~@Smoke,@Regression}   // this will excute nagation
			monochrome= true,  // make it false and check the diffrence in output
			dryRun=false,
			features= {"src/test/resources/com/basic/Basic1/basic/getWithTagsOfCucuFF/GetWithCucumberTags.feature"},
//		{"src/test/resources/com/basic/getWithTagsOfCucuFF/"},
			glue={"com/basic1/basic/getWithTagsOfCucuSD/"},
//		{"com/basic/getWithTagsOfCucuSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report6.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunGetWithTagsTest {


}
