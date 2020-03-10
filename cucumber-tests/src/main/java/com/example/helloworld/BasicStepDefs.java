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
        log.info("TESTS setup");

    }

    @When("^the endpoint is called$")
    public void theEndpointIsCalled() {
        log.info("TESTS call endpoint");
    }

    @Then("^the response is Hello World$")
    public void theResponseIsHelloWorld() {
        log.info("TESTS handle response details");

    }

    @Then("^the response code is (\\d+)$")
    public void theResponseCodeIs(int arg0) {
        log.info("TESTS handle response code");

    }
}
