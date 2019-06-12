package com.jhia.lab11.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String getWelcome() {
        return "Welcome to Songr";
    }

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello, world!";
    }
}
