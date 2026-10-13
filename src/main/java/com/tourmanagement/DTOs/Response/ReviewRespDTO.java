package com.tourmanagement.DTOs.Response;

import com.tourmanagement.Models.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ReviewRespDTO {
    private Long id;
    private Customer customer;
    private Long tourId;
    private String comment;
    private Double rating;

    public ReviewRespDTO() {
    }

    public ReviewRespDTO(Long id, Customer customer, Long tourId, String comment, Double rating) {
        this.id = id;
        this.customer = customer;
        this.tourId = tourId;
        this.comment = comment;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getTourId() {
        return tourId;
    }

    public void setTourId(Long tourId) {
        this.tourId = tourId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
