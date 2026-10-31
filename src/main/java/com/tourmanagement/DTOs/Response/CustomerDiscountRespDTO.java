package com.tourmanagement.DTOs.Response;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.tourmanagement.Models.Customer;
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
public class CustomerDiscountRespDTO {
    private Long id;
    private Long discountId;
    private Customer customer;
    private Long tourId;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date usageDate;

    public CustomerDiscountRespDTO() {
    }

    public CustomerDiscountRespDTO(Long id, Long discountId, Customer customer, Long tourId, Date usageDate) {
        this.id = id;
        this.discountId = discountId;
        this.customer = customer;
        this.tourId = tourId;
        this.usageDate = usageDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
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

    public Date getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(Date usageDate) {
        this.usageDate = usageDate;
    }
}
