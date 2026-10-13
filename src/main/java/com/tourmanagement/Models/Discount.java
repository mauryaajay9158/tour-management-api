package com.tourmanagement.Models;

import com.tourmanagement.Shared.Types.EnumStatusDiscount;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Table(name = "discounts")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String code;

    @Column(columnDefinition = "DOUBLE PRECISION", name = "discount_percentage", nullable = false)
    private Double discountPercentage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tour_id")
    private Tour tour;

    @Column(
            nullable = false,
            name = "start_date"
    )
    private Date startDate;

    @Column(
            nullable = false,
            name = "end_date"
    )
    private Date endDate;

    @Column(nullable = false)
    private Integer quantityDiscounts;

    @Column(nullable = false)
    private Integer quantityUsedDiscounts =  0;

    @Enumerated(EnumType.STRING)
    private EnumStatusDiscount status = EnumStatusDiscount.ACTIVE;
    @PrePersist
    @PreUpdate
    private void updateStatus() {
        Date currentDate = new Date();
        if (currentDate.before(startDate) || currentDate.after(endDate)) {
            this.status = EnumStatusDiscount.EXPIRED;
        }

        // Check if the quantity is zero
        if (quantityDiscounts != null && quantityDiscounts.equals(quantityUsedDiscounts)) {
            this.status = EnumStatusDiscount.EXPIRED;
        }

    }

    public Discount() {
    }

    public Discount(Long id, String code, Double discountPercentage, Tour tour, Date startDate, Date endDate, Integer quantityDiscounts, Integer quantityUsedDiscounts, EnumStatusDiscount status) {
        this.id = id;
        this.code = code;
        this.discountPercentage = discountPercentage;
        this.tour = tour;
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

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
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
