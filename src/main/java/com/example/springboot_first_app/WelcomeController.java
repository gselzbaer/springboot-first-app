package com.example.springboot_first_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    //maps HTTP GET requests onto the welcome method
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot World";
    }

}
