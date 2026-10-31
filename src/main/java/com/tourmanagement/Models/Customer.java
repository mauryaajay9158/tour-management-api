package com.tourmanagement.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;


/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, name = "phone_number")
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, name = "id_card")
    private String idCard;

    @Column(nullable = false)
    private Boolean gender;

    @Column(
            nullable = false,
            name = "date_of_birth"
    )
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;

    @Column(
            nullable = true,
            columnDefinition="TEXT"
    )
    private String avatar;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<CustomerDiscount> customerDiscounts;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Review> reviews;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<BookedTour> bookedTours;

    public Customer() {
    }

    public Customer(Long id, String name, String address, String phoneNumber, String email, String idCard, Boolean gender, Date dateOfBirth, String avatar, List<CustomerDiscount> customerDiscounts, List<Review> reviews, List<BookedTour> bookedTours) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.idCard = idCard;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.avatar = avatar;
        this.customerDiscounts = customerDiscounts;
        this.reviews = reviews;
        this.bookedTours = bookedTours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<CustomerDiscount> getCustomerDiscounts() {
        return customerDiscounts;
    }

    public void setCustomerDiscounts(List<CustomerDiscount> customerDiscounts) {
        this.customerDiscounts = customerDiscounts;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<BookedTour> getBookedTours() {
        return bookedTours;
    }

    public void setBookedTours(List<BookedTour> bookedTours) {
        this.bookedTours = bookedTours;
    }
}
