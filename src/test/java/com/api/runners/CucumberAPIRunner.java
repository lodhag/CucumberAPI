package com.api.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	
			    features = "src/test/resources/feature",
			    glue = "com.api.stepdefnitions",
			    plugin = {"pretty"},
			    monochrome = true,
			    tags = "@apiTesting"
			)

public class CucumberAPIRunner extends AbstractTestNGCucumberTests {


}
