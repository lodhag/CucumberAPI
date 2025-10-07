package com.api.stepdefnitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class CucumberAPIStepDefinition {
	
	private String endpoint;
	private Response response;
	
	 @Given("User should be able to send a GET request to the API endpoint")
	    public void user_should_be_able_to_send_a_get_request_to_the_api_endpoint(DataTable dataTable) {
		  List<String> data = dataTable.asList();
	        endpoint = data.get(0);
	        System.out.println("Endpoint: " + endpoint);
	    }
	  @When("User should be able to receive the valid response")
	    public void user_should_be_able_to_receive_the_valid_response() {
		   response = RestAssured.get(endpoint);
	        System.out.println("Response Body:\n" + response.getBody().asPrettyString());
	    }
	   
	  @Then("User should be able to validate the response status code")
	    public void user_should_be_able_to_validate_the_response_status_code() {
		   int statusCode = response.getStatusCode();
	        System.out.println("Status Code: " + statusCode);
	        Assert.assertEquals(statusCode, 200, "Expected status code is 200");
	    }
	  
	  @Then("User should be able to validate the fields in the response")
	    public void user_should_be_able_to_validate_the_fields_in_the_response() {
		  String firstId = response.jsonPath().getString("[0].id");
	        String firstName = response.jsonPath().getString("[0].name");
	        System.out.println("First Object ID: " + firstId);
	        System.out.println("First Object Name: " + firstName);
	        Assert.assertNotNull(firstId, "ID should not be null");
	        Assert.assertNotNull(firstName, "Name should not be null");
	    }
}
