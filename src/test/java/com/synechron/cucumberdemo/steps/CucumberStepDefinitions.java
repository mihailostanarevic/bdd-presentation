package com.synechron.cucumberdemo.steps;

import com.synechron.cucumberdemo.CucumberDemoApplication;
import com.synechron.cucumberdemo.service.DemoService;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CucumberStepDefinitions {
    int result, operand1, operand2 = -1;

    @Autowired
    private DemoService demoService;

    @Before("@v1")
    public void beforeV1tests() {
        result = -1;
        operand1 = -1;
        operand2 = -1;
    }

    @Given("I have two numbers: {int} and {int}")
    public void givenMethod(int a, int b) {
        operand1 = a;
        operand2 = b;
    }

    @When("I call the multiply method with those two numbers")
    public void whenMethod() {
        result = demoService.multiply(operand1, operand2);
    }

    @Then("I expect the result to be {int}")
    public void thenMethod(int result) {
        assertEquals(result, this.result);
    }
}
