package com.tourmanagement.DTOs.Response;

import lombok.Data;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class ScheduleTourRespDTO {
    private String title;
    private String description;
    private Long id;
    private Integer day;

    public ScheduleTourRespDTO() {
    }

    public ScheduleTourRespDTO(String title, String description, Long id, Integer day) {
        this.title = title;
        this.description = description;
        this.id = id;
        this.day = day;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
