package com.example.userms.util;

import com.example.userms.dto.UserDetails;
import com.example.userms.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserUtil {
    public UserDetails toUserDetails(User user){
        UserDetails userDetails = new UserDetails(user.getId(), user.getUsername(), user.getPassword(), user.getEmail());
        return userDetails;
    }
    public List<UserDetails> toUserDetails(List<User> userList){
        List<UserDetails> users = new ArrayList<>();
        for(User user: userList){
            UserDetails userDetails = new UserDetails(user.getId(), user.getUsername(), user.getPassword(), user.getEmail());
            users.add(userDetails);
        }
        return users;
    }
}
