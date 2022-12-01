package com.microservices.user.services.userservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.user.services.userservices.entities.User;

public interface UserRepository  extends JpaRepository<User,String>{
    
}
