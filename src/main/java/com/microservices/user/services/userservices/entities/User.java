package com.microservices.user.services.userservices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="micro_users")
public class User {
    @Id
    @Column(name="ID")
    private String userId;
    @Column(name="Name",length=20)
    private String name;
    @Column(name="Email")
    private String email;
    @Column(name="About")
    private String about;
}
