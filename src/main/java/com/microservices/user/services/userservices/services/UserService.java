package com.microservices.user.services.userservices.services;

import java.util.List;

import com.microservices.user.services.userservices.entities.User;

public interface UserService {
    //create
    User saveUser(User user);
    
    //get all user
    List<User> getAllUser();

    //get single user of given userId
    User getUser(String userId);

    //delete user
    void deleteUser(String userId);

    //update user
    User updateUser(User user, String userId);
}
