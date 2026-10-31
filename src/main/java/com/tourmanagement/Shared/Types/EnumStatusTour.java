package com.tourmanagement.Shared.Types;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public enum EnumStatusTour {
    NOSTART("Upcoming"),
    STARTED("In Progress"),
    FINISHED("Completed");

    private final String status;

    EnumStatusTour(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
