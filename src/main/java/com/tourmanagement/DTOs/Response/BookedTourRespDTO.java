package com.tourmanagement.DTOs.Response;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tourmanagement.Models.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

public class BookedTourRespDTO {
    private Long id;
    private Customer customer;
    private TourRespDTO tour;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date bookingDate;
    private String status;
    private String note;
    @JsonProperty("isPaid")
    private boolean isPaid;
    private double totalMoney;

    public BookedTourRespDTO() {
    }

    public BookedTourRespDTO(Long id, Customer customer, TourRespDTO tour, Date bookingDate, String status, String note, boolean isPaid, double totalMoney) {
        this.id = id;
        this.customer = customer;
        this.tour = tour;
        this.bookingDate = bookingDate;
        this.status = status;
        this.note = note;
        this.isPaid = isPaid;
        this.totalMoney = totalMoney;
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

    public TourRespDTO getTour() {
        return tour;
    }

    public void setTour(TourRespDTO tour) {
        this.tour = tour;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
