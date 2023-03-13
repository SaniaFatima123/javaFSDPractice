package com.example.userService.service;

import com.example.userService.entities.User;

import java.util.List;

public interface IUserService {
    User add(User user);
    User findByUserId(String userId);
    List<User> findAll();
}
