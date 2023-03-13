package com.example.userService.controller;

import com.example.userService.entities.User;
import com.example.userService.service.UserServiceImpl;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    @CircuitBreaker(name = "userRatingBookCircuit", fallbackMethod = "fallBack")
    @GetMapping("/findbyid/{userId}")
    public User findByUserId(@PathVariable String userId){
        return service.findByUserId(userId);
    }

    @CircuitBreaker(name = "userRatingBookCircuit", fallbackMethod = "fallBack")
    @GetMapping("/findall")
    public List<User> findAll(){
        return  service.findAll();
    }
    public User fallBack(String userId, Exception e){
        User user = new User("dummy","dummy@gmail.com",new ArrayList<>());
        return user;
    }
    public List<User> fallBack(Exception e){
        return new ArrayList<>();
    }
}
