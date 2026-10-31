package com.tourmanagement.DTOs.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class RevenueRespDTO {
    private double totalMoney;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date date;

    public RevenueRespDTO() {
    }

    public RevenueRespDTO(double totalMoney, Date date) {
        this.totalMoney = totalMoney;
        this.date = date;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
