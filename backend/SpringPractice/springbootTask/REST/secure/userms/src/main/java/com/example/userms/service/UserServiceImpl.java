package com.example.userms.service;

import com.example.userms.dto.AddRegisterRequest;
import com.example.userms.dto.LoginUserRequest;
import com.example.userms.dto.UserDetails;
import com.example.userms.entity.User;
import com.example.userms.exception.InvalidCredential;
import com.example.userms.exception.InvalidTokenException;
import com.example.userms.exception.UserNotFoundException;
import com.example.userms.repository.UserRepository;
import com.example.userms.util.TokenUtil;
import com.example.userms.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserUtil util;
    @Autowired
    private TokenUtil tokenUtil;

    @Override
    public UserDetails registerUser(AddRegisterRequest request) {
        User user = new User(request.getUsername(), request.getPassword(), request.getEmail());
        User added = repository.save(user);
        UserDetails userDetails = util.toUserDetails(added);
        return userDetails;
    }

    @Override
    public User findByUsername(String username) throws UserNotFoundException {
        Optional<User> response = repository.findByUsername(username);
        if (!response.isPresent()) {
            throw new UserNotFoundException("User Not Found");
        }
        return response.get();
    }

    @Override
    public UserDetails findDetailsByUsername(String username) throws UserNotFoundException {
        User user = findByUsername(username);
        UserDetails userDetails = util.toUserDetails(user);
        return userDetails;
    }

    @Override
    public List<UserDetails> findAll() {
        List<User> userList = repository.findAll();
        List<UserDetails> users = util.toUserDetails(userList);
        return users;
    }

    @Override
    public String login(LoginUserRequest request) throws InvalidCredential {
        Optional<User> optional = repository.findByUsername(request.getUsername());
        if (!optional.isPresent()) {
            throw new InvalidCredential("Invalid Credential");
        }
        User user = optional.get();
        if (!request.getPassword().equals(user.getPassword())) {
            throw new InvalidCredential("Invalid Credential");
        }
        String token = tokenUtil.generateToken(request.getUsername());
        return token;
    }

    @Override
    public UserDetails authenticateByToken(String token) throws InvalidTokenException, UserNotFoundException {
        String username = tokenUtil.decodeToken(token);
        User user = findByUsername(username);
        UserDetails userDetails = util.toUserDetails(user);
        return userDetails;
    }

}
