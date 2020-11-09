package com.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt",
                "html:target/cucumber-report.html",
        },
        features = "src/test/resources/features",
        glue = "com/library/step_definitions",
        tags = "@US1_AC4",
        dryRun =false,
        publish = false
)


public class CukesRunner {



}
