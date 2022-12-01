package com.microservices.user.services.userservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.user.services.userservices.entities.User;
import com.microservices.user.services.userservices.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    //create
    public ResponseEntity<User> createUser(@RequestBody User user){
     User user1= userService.saveUser(user);
     return ResponseEntity.status(HttpStatus.CREATED).body(user1);
        
    }
}
