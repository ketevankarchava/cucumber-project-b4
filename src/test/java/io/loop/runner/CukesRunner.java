package io.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-report.html",
                    "json:target/json-reports/json-report.json",
                    "pretty",
                    "rerun:target/rerun.txt",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "C:/Users/KETO/IdeaProjects/cucumber-project-b4/src/test/resources/features",
        glue = "C:/Users/KETO/IdeaProjects/cucumber-project-b4/src/test/java/io/loop/step_definitions",
        dryRun = false,
        tags = "@listOfMap",
        monochrome = true,
        publish = false
)

public class CukesRunner {
}
