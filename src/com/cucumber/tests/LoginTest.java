package com.cucumber.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "gherkinsFeatures", glue = "cucumberimplementations")
public class LoginTest {

}
	