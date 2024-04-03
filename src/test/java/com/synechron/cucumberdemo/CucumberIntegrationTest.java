package com.synechron.cucumberdemo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com/synechron/cucumberdemo/steps",
    plugin = {"pretty", "html:target/test-results/test.html"}
)
public class CucumberIntegrationTest { }
