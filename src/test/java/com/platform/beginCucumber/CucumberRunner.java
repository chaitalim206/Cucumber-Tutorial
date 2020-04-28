package com.platform.beginCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:LoginTest/login.feature",glue= "com.platform.beginCucumber")
public class CucumberRunner {

}
