package com.example.userms.service;

import com.example.userms.dto.AddRegisterRequest;
import com.example.userms.dto.LoginUserRequest;
import com.example.userms.dto.UserDetails;
import com.example.userms.entity.User;
import com.example.userms.exception.InvalidCredential;
import com.example.userms.exception.InvalidTokenException;
import com.example.userms.exception.UserNotFoundException;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;
@Validated
public interface IUserService {
    UserDetails registerUser(@Valid AddRegisterRequest request);
    User findByUsername(@Length(min=2) String username) throws UserNotFoundException;
    UserDetails findDetailsByUsername(@Length(min=2) String username) throws UserNotFoundException;
    List<UserDetails> findAll();

    String login(@Valid LoginUserRequest request) throws InvalidCredential;
    UserDetails authenticateByToken(String token) throws InvalidTokenException, UserNotFoundException;
}
