package com.tourmanagement.DTOs.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tourmanagement.Shared.Types.EnumStatusDiscount;
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
public class DiscountRespDTO {

    private Long id;

    private String code;

    private Double discountPercentage;

    private Long tourId;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date startDate;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date endDate;

    private Integer quantityDiscounts;

    private Integer quantityUsedDiscounts;

    private EnumStatusDiscount status;

    public DiscountRespDTO() {
    }

    public DiscountRespDTO(Long id, String code, Double discountPercentage, Long tourId, Date startDate, Date endDate, Integer quantityDiscounts, Integer quantityUsedDiscounts, EnumStatusDiscount status) {
        this.id = id;
        this.code = code;
        this.discountPercentage = discountPercentage;
        this.tourId = tourId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantityDiscounts = quantityDiscounts;
        this.quantityUsedDiscounts = quantityUsedDiscounts;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getQuantityUsedDiscounts() {
        return quantityUsedDiscounts;
    }

    public void setQuantityUsedDiscounts(Integer quantityUsedDiscounts) {
        this.quantityUsedDiscounts = quantityUsedDiscounts;
    }

    public EnumStatusDiscount getStatus() {
        return status;
    }

    public void setStatus(EnumStatusDiscount status) {
        this.status = status;
    }
}
