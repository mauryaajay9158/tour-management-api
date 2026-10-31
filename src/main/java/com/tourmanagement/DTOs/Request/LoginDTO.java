package com.tourmanagement.DTOs.Request;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.io.Serializable;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class LoginDTO implements Serializable {
    @NotNull(message = "Username cannot be null!")
    @Size(min = 5, message = "Username has 5 characters at least!")
    private String username;

    @NotNull(message = "Password cannot be null!")
    @Size(min = 8, message = "Password has 5 characters at least!")
    private String password;

    public LoginDTO() {
    }

    public LoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

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
}
