package com.microservices.user.services.userservices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.user.services.userservices.entities.User;
import com.microservices.user.services.userservices.exceptions.ResourceNotFoundException;
import com.microservices.user.services.userservices.repositories.UserRepository;
import com.microservices.user.services.userservices.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {
    @Autowired 
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {       
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {     
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id not found on server"));
    }

  

    @Override
    public void deleteUser(String userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User updateUser(User user, String userId) {
       
        return null;
    }
   

}
