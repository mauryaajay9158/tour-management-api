package com.tourmanagement.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tourmanagement.DTOs.Response.TourRespDTO;
import com.tourmanagement.Shared.Types.EnumStatusBookedTour;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Table(name = "booked_tours")
public class BookedTour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tour_id")
    private Tour tour;

    @Column(
            name = "booking_date"
    )
    private Date bookingDate = new Date();

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EnumStatusBookedTour status = EnumStatusBookedTour.PENDING;

    @Column(nullable = true)
    private String note;

    @Column(name = "is_paid", columnDefinition = "BOOLEAN DEFAULT false")
    private boolean isPaid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "discount_id")
    private Discount discount;

    @Column(name = "total_money", columnDefinition = "DOUBLE DEFAULT 0.0")
    private Double totalMoney = 0.0;

    public BookedTour() {
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

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public EnumStatusBookedTour getStatus() {
        return status;
    }

    public void setStatus(EnumStatusBookedTour status) {
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

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
