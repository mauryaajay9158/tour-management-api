package com.tourmanagement.DTOs.Request;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class CustomerDiscountDTO {

    @NotNull(message = "Discount ID cannot be null!")
    private Long discountId;
    @NotNull(message = "Customer ID cannot be null!")
    private Long customerId;
    @NotNull(message = "Tour ID cannot be null!")
    private Long tourId;
    @NotNull(message = "UsageDate cannot be null!")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date usageDate;

    public CustomerDiscountDTO() {
    }

    public CustomerDiscountDTO(Long discountId, Long customerId, Long tourId, Date usageDate) {
        this.discountId = discountId;
        this.customerId = customerId;
        this.tourId = tourId;
        this.usageDate = usageDate;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
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

    public Date getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(Date usageDate) {
        this.usageDate = usageDate;
    }
}
