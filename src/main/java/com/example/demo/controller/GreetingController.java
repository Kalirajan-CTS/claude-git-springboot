package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> hello() {
        return ResponseEntity.ok(Map.of("message", "Hello, Spring Boot!"));
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<Map<String, String>> helloName(@PathVariable String name) {
        return ResponseEntity.ok(Map.of("message", String.format("Hello, %s!", name)));
    }
}
