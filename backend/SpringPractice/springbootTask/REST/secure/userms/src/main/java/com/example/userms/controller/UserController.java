package com.example.userms.controller;

import com.example.userms.dto.AddRegisterRequest;
import com.example.userms.dto.LoginUserRequest;
import com.example.userms.dto.UserDetails;
import com.example.userms.exception.InvalidCredential;
import com.example.userms.exception.InvalidTokenException;
import com.example.userms.exception.UserNotFoundException;
import com.example.userms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService service;

    @GetMapping("/findbyname/{username}")
    public UserDetails findByName(HttpServletRequest request, @PathVariable String username) throws Exception, InvalidTokenException {
       /* String token = request.getHeader("token");
        UserDetails userDetails = service.authenticateByToken(token);
        if(!userDetails.getUsername().equals(username)){
            throw new InvalidTokenException("Token Invalid");
        }  */
        UserDetails response  = service.findDetailsByUsername(username);
        return response;
    }

    @GetMapping("/findall")
    public List<UserDetails> findAll(HttpServletRequest request) throws Exception, InvalidTokenException {
       /* String token = request.getHeader("token");
        UserDetails userDetails = service.authenticateByToken(token);*/
        List<UserDetails> response = service.findAll();
        return response;
    }
}
