package com.tourmanagement.DTOs.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

public class TourGuideDTO implements Serializable {
    @NotNull(message = "Name cannot be null!")
    @Size(min = 2, message = "Name must have 2 characters at least")
    private String name;

    @NotNull(message = "Address cannot be null!")
    @Size(min = 2, message = "Address must have 2 characters at least")
    private String address;

    @NotNull(message = "Phone Number cannot be null!")
    private String phoneNumber;

    @NotNull(message = "Email is not null!")
    private String email;

    @NotNull(message = "Id card cannot be null!")
    @Size(min = 2, message = "Id card must have 2 characters at least")
    private String idCard;

    public TourGuideDTO() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
