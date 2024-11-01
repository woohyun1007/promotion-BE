package com.example.firstproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")

public class controller {
    @GetMapping("/test")
    public ResponseEntity<String> getData() {
        return ResponseEntity.ok("Hello");
    }
}
