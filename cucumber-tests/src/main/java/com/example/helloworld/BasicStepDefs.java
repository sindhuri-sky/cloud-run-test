package com.example.helloworld;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class BasicStepDefs
{
    private static final Logger log = LoggerFactory.getLogger(BasicStepDefs.class);

    CloseableHttpClient httpClient = HttpClients.createDefault();
    CloseableHttpResponse response;

    @Given("^setup app$")
    public void setupApp() {
        log.info("TESTS setup123");

    }

    @When("^the endpoint is called in functional$")
    public void theEndpointIsCalledInFunc() throws IOException {
        log.info("TESTS call endpoint");
        HttpGet request = new HttpGet("https://cloud-run-test-func-g3352oeadq-uc.a.run.app/");
        request.addHeader("content-type", "application/json");
        response = httpClient.execute(request);
    }

    @When("^the endpoint is called in integration$")
    public void theEndpointIsCalledInInt() throws IOException {
        log.info("TESTS call endpoint");
        HttpGet request = new HttpGet("https://cloud-run-test-int-g3352oeadq-uc.a.run.app/");
        request.addHeader("content-type", "application/json");
        response = httpClient.execute(request);
    }

    @Then("^the response is Hello World$")
    public void theResponseIsHelloWorld() throws IOException {
        log.info("TESTS handle response details");
        assertEquals("Hello World!", EntityUtils.toString(response.getEntity()));
    }

    @Then("^the response code is (\\d+)$")
    public void theResponseCodeIs(int arg0) {
        log.info("TESTS handle response code");
        assertEquals(200, response.getStatusLine().getStatusCode());

    }
}
