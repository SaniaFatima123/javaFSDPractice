package com.example.userms.controller;

import com.example.userms.dto.AddUserRequest;
import com.example.userms.dto.UserDetails;
import com.example.userms.exception.UserNotFoundException;
import com.example.userms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService service;

    @PostMapping("/add")
    public ResponseEntity<UserDetails> addUsers(@RequestBody AddUserRequest request) {
        UserDetails response = service.addUser(request);
        return new ResponseEntity<UserDetails>(response, HttpStatus.CREATED);
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity findUser(@PathVariable int id) {
        try {
            UserDetails response = service.findUserDetailsById(id);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (UserNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    @GetMapping("/findall")
    public ResponseEntity<List<UserDetails>> findAll(){
        List<UserDetails> response = service.findAll();
        return new ResponseEntity<List<UserDetails>>(response,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable int id){
        try {
            service.delete(id);
           // return ResponseEntity.status(HttpStatus.OK).body("deleted");
            return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
        } catch (UserNotFoundException e) {
          //  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user not found");
            return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
        }
    }
}
