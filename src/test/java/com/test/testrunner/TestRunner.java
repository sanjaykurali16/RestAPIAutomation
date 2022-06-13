package com.test.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * Represents the test runner file for cucumber.
 *
 * @Sanjay testing
 *
 */
@CucumberOptions(features = { "features/" }, glue = { "com.test.stepdef" }, plugin = { "pretty",
    "html:test-output/Cucumber_Report/cucumber.html",
    "json:test-output/Cucumber_Report/cucumber.json" }, tags = "@API")
public class TestRunner extends AbstractTestNGCucumberTests {

  @Override
  @DataProvider
  public Object[][] scenarios() {

    return super.scenarios();
  }

}