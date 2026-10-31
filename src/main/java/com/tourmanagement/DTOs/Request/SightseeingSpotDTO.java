package com.tourmanagement.DTOs.Request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class SightseeingSpotDTO implements Serializable {
    @NotNull(message = "Name cannot be null!")
    @Size(min = 2, message = "Name must have 2 characters at least")
    private String name;

    @NotNull(message = "Address cannot be null!")
    @Size(min = 2, message = "Address must have 2 characters at least")
    private String address;

    public SightseeingSpotDTO() {
    }

    public SightseeingSpotDTO(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
