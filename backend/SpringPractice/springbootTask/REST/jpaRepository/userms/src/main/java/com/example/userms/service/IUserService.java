package com.example.userms.service;

import com.example.userms.dto.AddUserRequest;
import com.example.userms.dto.UserDetails;
import com.example.userms.entity.User;
import com.example.userms.exception.UserNotFoundException;
import com.example.userms.util.UserUtil;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
public interface IUserService {
    UserDetails addUser(@Valid AddUserRequest request);

    User findById(@Min(1) int id) throws UserNotFoundException;

    UserDetails findUserDetailsById(@Min(1) int id) throws UserNotFoundException;

    List<UserDetails> findAll();

    void delete(@Min(1) int id) throws UserNotFoundException;
}
