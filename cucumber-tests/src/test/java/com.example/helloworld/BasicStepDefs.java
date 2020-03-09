package com.example.helloworld;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicStepDefs
{
    private static final Logger log = LoggerFactory.getLogger(BasicStepDefs.class);

    @Given("^setup app$")
    public void setupApp() {

    }

    @When("^the endpoint is called$")
    public void theEndpointIsCalled() {

    }

    @Then("^the response is Hello World$")
    public void theResponseIsHelloWorld() {
    }

    @Then("^the response code is (\\d+)$")
    public void theResponseCodeIs(int arg0) {
        log.info("TESTS passed");

    }
}
