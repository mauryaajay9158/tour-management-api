package com.tourmanagement.DTOs.Response;

import lombok.Data;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class QuantityStatisticResp {
    private Long quantityTour;
    private Long quantityCustomer;
    private Long quantityBookedTour;
    private Long quantityBookedTourToday;

    public QuantityStatisticResp() {
    }

    public QuantityStatisticResp(Long quantityTour, Long quantityCustomer, Long quantityBookedTour, Long quantityBookedTourToday) {
        this.quantityTour = quantityTour;
        this.quantityCustomer = quantityCustomer;
        this.quantityBookedTour = quantityBookedTour;
        this.quantityBookedTourToday = quantityBookedTourToday;
    }

    public Long getQuantityTour() {
        return quantityTour;
    }

    public void setQuantityTour(Long quantityTour) {
        this.quantityTour = quantityTour;
    }

    public Long getQuantityCustomer() {
        return quantityCustomer;
    }

    public void setQuantityCustomer(Long quantityCustomer) {
        this.quantityCustomer = quantityCustomer;
    }

    public Long getQuantityBookedTour() {
        return quantityBookedTour;
    }

    public void setQuantityBookedTour(Long quantityBookedTour) {
        this.quantityBookedTour = quantityBookedTour;
    }

    public Long getQuantityBookedTourToday() {
        return quantityBookedTourToday;
    }

    public void setQuantityBookedTourToday(Long quantityBookedTourToday) {
        this.quantityBookedTourToday = quantityBookedTourToday;
    }
}
