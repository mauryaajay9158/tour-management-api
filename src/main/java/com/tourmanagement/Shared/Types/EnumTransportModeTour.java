package com.tourmanagement.Shared.Types;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public enum EnumTransportModeTour {
    BUS("Bus"),
    PLANE("Flight");

    private final String transportation;

    EnumTransportModeTour(String transportation) {
        this.transportation = transportation;
    }

    public String getTransportation() {
        return transportation;
    }
}
