package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/UserController")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService; //Dependency Inject


    @GetMapping("/getusers")
    public List<UserDto> getUser() {

        return userService.getAllUsers();

    }



}
