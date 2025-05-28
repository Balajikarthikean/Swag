package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/feature",
        glue = {"com.stepdef", "com.hooks"},
        plugin = {"pretty","json:target/cucumber.json",   // 👈 Important
                "html:target/cucumber-reports.html"},
        monochrome = true
)
public class RunnerClass {

}