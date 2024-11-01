package com.example.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstproject.entity.User;
import com.example.firstproject.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/api/test")
    public void saveTestEntity(@RequestBody User user) {
        System.out.println(user);
        userService.saveUser(user);
    }

    @GetMapping("/api/test")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
