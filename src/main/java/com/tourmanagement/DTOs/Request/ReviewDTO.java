package com.tourmanagement.DTOs.Request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ReviewDTO{

    @NotNull(message = "Customer ID cannot be null!")
    private Long customerId;
    @NotNull(message = "Tour ID cannot be null!")
    private Long tourId;
    @Size(min = 2, message = "Comment must have 2 characters at least")
    private String comment;
    @PositiveOrZero(message = "Rating must be a positive or zero value")
    private Double rating;

    public ReviewDTO() {
    }

    public ReviewDTO(Long customerId, Long tourId, String comment, Double rating) {
        this.customerId = customerId;
        this.tourId = tourId;
        this.comment = comment;
        this.rating = rating;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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
