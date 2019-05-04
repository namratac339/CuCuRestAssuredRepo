package com.basic.Myf1circuit;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;




public class MycircuitStepDef {
	private static final Object actualcircuitvalue = null;
	Response resp;
	@Given("^user start the rest assusered test$")
	public void user_start_the_rest_assusered_test() throws Throwable {
	   
	   
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
	   
	   
	}

	@Then("^user checks the count size$")
	public void user_checks_the_count_size() throws Throwable {
	  String limitValue=resp.getBody().jsonPath().getString("MRData.limit");
	  Assert.assertEquals("30", limitValue);
	  resp.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId,hassize(20)");
	}

	@Then("^user checks at path \"([^\"]*)\"value")
	public void user_checks_at_path(String expectedcircuitvalue) throws Throwable {
	   System.out.println("verify string value  ");
		String actualCircuitValue=resp.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals(expectedcircuitvalue,actualcircuitvalue);
	}


}
