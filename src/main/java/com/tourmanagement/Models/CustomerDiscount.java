package com.tourmanagement.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Table(name = "customer_discounts")
public class CustomerDiscount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discount_code")
    private Discount discount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tour_id")
    private Tour tour;

    @Column(
            nullable = false,
            name = "usage_date"
    )
    private Date usageDate;

    public CustomerDiscount() {
    }

    public CustomerDiscount(Long id, Discount discount, Customer customer, Tour tour, Date usageDate) {
        this.id = id;
        this.discount = discount;
        this.customer = customer;
        this.tour = tour;
        this.usageDate = usageDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
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

    public Date getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(Date usageDate) {
        this.usageDate = usageDate;
    }
}
