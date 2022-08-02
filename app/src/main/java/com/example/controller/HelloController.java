package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello2");
    }
}
