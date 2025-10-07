Feature:API Testing Training

@apiTesting
Scenario:To validate the API testing process
	Given User should be able to send a GET request to the API endpoint
		|https://api.restful-api.dev/objects|
	When User should be able to receive the valid response
	Then User should be able to validate the response status code
	Then User should be able to validate the fields in the response