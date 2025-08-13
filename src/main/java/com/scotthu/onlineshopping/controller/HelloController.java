package com.scotthu.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String HelloWorld() {return "Hello World";}

    @GetMapping("/echo/{text}")
    public String echo(@PathVariable String text) {
        return "Hello, you just input " + text;
    }
}
