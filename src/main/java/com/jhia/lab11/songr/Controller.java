package com.jhia.lab11.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String getWelcome() {
        return "Welcome to Songr";
    }

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello, world!";
    }

    //capitalize?uppercase=these are the words to uppercase
    @GetMapping("/capitalize")
    public String getCapitalizedString(@RequestParam String sentence) {
        return sentence.toUpperCase();
    }

    @GetMapping("reverse/{param}")
    public String getReverse(@PathVariable String param) {
        String [] strings = param.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = strings.length; i > 0; i = i - 1) {
            output.append(strings[i - 1] + " ");
        }
        return output.toString().trim();
    }
}
