package com.example.userms.controller;

import com.example.userms.dto.AddRegisterRequest;
import com.example.userms.dto.LoginUserRequest;
import com.example.userms.dto.UserDetails;
import com.example.userms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    private IUserService service;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDetails registerUser(@RequestBody AddRegisterRequest request){
        UserDetails response = service.registerUser(request);
        return response;
    }
    @PostMapping("/login")
    public String loginUser(@RequestBody LoginUserRequest request) throws Exception {
        String token = service.login(request);
        return token;
    }
}
