package com.tourmanagement.DTOs.Payload;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class FilterBookedTour {
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDate;
    private String status;
    @PositiveOrZero(message = "Page must be a positive number or Zero number")
    private int page;
    @Positive(message = "Items per page must be a positive number")
    private int itemsPerPage;

    public FilterBookedTour() {
    }

    public FilterBookedTour(Date startDate, Date endDate, String status, int page, int itemsPerPage) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.page = page;
        this.itemsPerPage = itemsPerPage;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }
}
