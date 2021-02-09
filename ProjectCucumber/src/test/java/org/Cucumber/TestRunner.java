package org.Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="org.Stepdefinition", dryRun=false, tags="@smoke")

public class TestRunner {

}
