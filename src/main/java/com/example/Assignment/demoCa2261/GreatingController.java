package com.example.Assignment.demoCa2261;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatingController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Spring Boot!";
    }


    @GetMapping("/greet/{shamsa}")
    public String greet(@PathVariable String shamsa) {
        return "Hello, " + shamsa + "!";
    }
}