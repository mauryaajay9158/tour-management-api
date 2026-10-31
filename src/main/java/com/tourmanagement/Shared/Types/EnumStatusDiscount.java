package com.tourmanagement.Shared.Types;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public enum EnumStatusDiscount {
    ACTIVE("active"),
    EXPIRED("expired");
    private final String value;

    EnumStatusDiscount(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EnumStatusDiscount fromString(String status) {
        if(status.isEmpty()) return null;
        for (EnumStatusDiscount enumStatus : EnumStatusDiscount.values()) {
            if (enumStatus.value.equalsIgnoreCase(status.toLowerCase())) {
                return enumStatus;
            }
        }
        throw new IllegalArgumentException("No constant with the specified status found");
    }

}
