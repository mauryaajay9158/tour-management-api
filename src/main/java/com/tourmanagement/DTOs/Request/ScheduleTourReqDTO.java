package com.tourmanagement.DTOs.Request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ScheduleTourReqDTO {
    @NotNull(message = "Title cannot be empty!")
    private String title;

    @NotNull(message = "Description cannot be empty!")
    private String description;

    @NotNull(message = "Day cannot be empty!")
    @Positive(message = "Day must be a positive number!")
    private Integer day;

    public ScheduleTourReqDTO() {
    }

    public ScheduleTourReqDTO(String title, String description, Integer day) {
        this.title = title;
        this.description = description;
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

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
