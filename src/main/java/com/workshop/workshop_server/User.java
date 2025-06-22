package com.workshop.workshop_server;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"users\"")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public User() {
        this.name = "No Name";
    }

    public User(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
