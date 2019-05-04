package com.basic.B17googletest;

import org.junit.Assert;
import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class MyGoogleStepDef {
	Response res;
	@Given("^I want to open goolge$")
	 
	public void i_want_to_open_goolge() throws Throwable {
	    System.out.println("hitting google.com");
	    res=RestAssured.given().get("http://www.google.com");
	   
	}

	@Then("^I want to check status code$")
	public void i_want_to_check_status_code() throws Throwable {
	    System.out.println("validateing status code");
	    int stcode=res.getStatusCode();
	    
	}
	@Then("^I want to check \"([^\"]*)\"status code$")
	public void i_want_to_check_status_code1(String statusCode) throws Throwable {
	    System.out.println("validateing status code");
	    int stcode=res.getStatusCode();
	    String ssStcode=Integer.toString(stcode);
	    Assert.assertEquals(ssStcode, statusCode);
	
	}
}


