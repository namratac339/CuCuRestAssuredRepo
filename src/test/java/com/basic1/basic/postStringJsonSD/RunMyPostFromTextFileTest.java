package com.basic1.basic.postStringJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/Basic1/basic/dataDrivenFF/"},
		glue={"com/basic1/basic/dataDrivenSD"}
		
		)
		

public class RunMyPostFromTextFileTest {


}
