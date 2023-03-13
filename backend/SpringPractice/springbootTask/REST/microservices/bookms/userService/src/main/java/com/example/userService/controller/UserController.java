package com.example.userService.controller;

import com.example.userService.entities.User;
import com.example.userService.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserServiceImpl service;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public User add(@RequestBody User user){
        return service.add(user);
    }
    @GetMapping("/findbyid/{userId}")
    public User findByUserId(@PathVariable String userId){
        return service.findByUserId(userId);
    }
    @GetMapping("/findall")
    public List<User> findAll(){
        return  service.findAll();
    }
}
