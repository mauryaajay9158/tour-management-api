package com.tourmanagement.DTOs.Request;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.tourmanagement.Shared.Types.EnumStatusDiscount;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Date;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class DiscountDTO {

    @NotNull(message = "Code cannot be null")
    @Size(min = 2, message = "Code must have at least 2 characters")
    private String code;

    @PositiveOrZero( message = "Discount percentage must be a positive or zero value")
    private Double discountPercentage;

    @NotNull(message = "Tour ID cannot be null")
    private Long tourId;

    @NotNull(message = "Start date cannot be null")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date startDate;

    @NotNull(message = "End date cannot be null")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date endDate;

    @NotNull(message = "Quantity discounts cannot be null")
    private Integer quantityDiscounts;

    @NotNull(message = "Enum status cannot be null")
    private EnumStatusDiscount status;

    @AssertTrue(message = "Start date must be before or equal to end date")
    private boolean isStartDateBeforeEndDate() {
        return startDate == null || endDate == null || !startDate.after(endDate);
    }

    @AssertTrue(message = "Discount percentage should be between 0 and 100")
    private boolean isDiscountPercentageInRange() {
        return discountPercentage == null || (discountPercentage >= 0 && discountPercentage <= 100);
    }

    public DiscountDTO() {
    }

    public DiscountDTO(String code, Double discountPercentage, Long tourId, Date startDate, Date endDate, Integer quantityDiscounts, EnumStatusDiscount status) {
        this.code = code;
        this.discountPercentage = discountPercentage;
        this.tourId = tourId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantityDiscounts = quantityDiscounts;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Long getTourId() {
        return tourId;
    }

    public void setTourId(Long tourId) {
        this.tourId = tourId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getQuantityDiscounts() {
        return quantityDiscounts;
    }

    public void setQuantityDiscounts(Integer quantityDiscounts) {
        this.quantityDiscounts = quantityDiscounts;
    }

    public EnumStatusDiscount getStatus() {
        return status;
    }

    public void setStatus(EnumStatusDiscount status) {
        this.status = status;
    }
}
