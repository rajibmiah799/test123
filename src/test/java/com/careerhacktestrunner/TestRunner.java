package com.careerhacktestrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

	features = "Feature",
	glue = "com.accountcreatingstepdef",
	tags = "@CreatingAcc",
	monochrome = true
	
		
		
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
