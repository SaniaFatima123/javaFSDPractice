package com.example.userms.service;

import com.example.userms.dto.AddUserRequest;
import com.example.userms.dto.UserDetails;
import com.example.userms.entity.User;
import com.example.userms.exception.UserNotFoundException;
import com.example.userms.repository.UserRepository;
import com.example.userms.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserUtil util;
    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails addUser(AddUserRequest request) {
        User user = new User(request.getName(),request.getAge());
        User added = repository.save(user);
        UserDetails userDetails = util.toUserDetails(added);
        return userDetails;
    }

    @Override
    public User findById(int id) throws UserNotFoundException {
        Optional<User> user = repository.findById(id);
        if(!user.isPresent()){
            throw new UserNotFoundException("user not found with id "+id);
        }
        return user.get();
    }

    @Override
    public UserDetails findUserDetailsById(int id) throws UserNotFoundException {
        User user = findById(id);
        UserDetails userDetails = util.toUserDetails(user);
        return userDetails;
    }

    @Override
    public List<UserDetails> findAll() {
        List<User> users = repository.findAll();
        List<UserDetails> userDetailsList = util.toUserDetails(users);
        return userDetailsList;
    }

    @Override
    public void delete(int id) throws UserNotFoundException {
        User user = findById(id);
        repository.delete(user);
    }
}
