package com.test.testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Represents a student enrolled in the school.
 *
 * @Sanjay testing
 *
 */
@CucumberOptions(features = { "features/" }, glue = { "com.test.stepdef" }, plugin = { "pretty",
    "html:test-output/Cucumber_Report/cucumber.html", "json:test-output/Cucumber_Report/cucumber.json" }, tags = "@API")
public class TestRunner extends AbstractTestNGCucumberTests {

  @Override
  @DataProvider
  public Object[][] scenarios() {

    return super.scenarios();
  }

}