package com.tourmanagement.DTOs.Request;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class BookedTourDTO {
    @NotNull(message = "Customer ID cannot be null")
    private Long customerId;
    @NotNull(message = "Tour ID cannot be null")
    private Long tourId;
    private String note;

    public BookedTourDTO() {
    }

    public BookedTourDTO(Long customerId, Long tourId, String note) {
        this.customerId = customerId;
        this.tourId = tourId;
        this.note = note;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
