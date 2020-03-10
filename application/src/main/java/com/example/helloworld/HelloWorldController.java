package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Value("${TARGET:World}")
    String target;

    @GetMapping()
    String hello() {

        return "Hello " + target + "!";
    }

}