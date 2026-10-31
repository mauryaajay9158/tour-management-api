package com.tourmanagement.DTOs.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class CustomerReqDTO {
    @NotNull(message = "Name cannot be null!")
    private String name;
    @NotNull(message = "Address cannot be null!")
    private String address;
    @NotNull(message = "PhoneNumber cannot be null!")
    private String phoneNumber;
    @NotNull(message = "Email cannot be null!")
    private String email;
    @NotNull(message = "ID Card cannot be null!")
    private String idCard;
    @NotNull(message = "Gender cannot be null!")
    private Boolean gender;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    private MultipartFile avatar;

    public CustomerReqDTO() {
    }

    public CustomerReqDTO(String name, String address, String phoneNumber, String email, String idCard, Boolean gender, Date dateOfBirth, MultipartFile avatar) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.idCard = idCard;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.avatar = avatar;
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }
}
