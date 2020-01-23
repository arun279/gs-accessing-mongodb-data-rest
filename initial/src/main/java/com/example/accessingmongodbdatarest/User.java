package com.example.accessingmongodbdatarest;

import org.springframework.data.annotation.Id;

public class User {
    @Id private String id;
    private String username;
    private String password;
    private int role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }
    
    public void setRole(int role) {
        this.role = role;
    }
}