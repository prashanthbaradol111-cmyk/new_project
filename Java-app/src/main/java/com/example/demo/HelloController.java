package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Application is running successfully!";
    }

    @GetMapping("/api/health")
    public String healthCheck() {
        return "UP";
    }
}
