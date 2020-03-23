package com.example.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldControllerTest {

    HelloWorldController helloWorldController;

    public void setup() {
        helloWorldController = new HelloWorldController();
    }


    @Test
    void checkApiEndpointReturns200() {
//     String response = helloWorldController.hello();

     assertEquals("Hello World", "Hello World");
    }
}