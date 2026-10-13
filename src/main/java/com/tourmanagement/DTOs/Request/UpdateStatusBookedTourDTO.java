package com.tourmanagement.DTOs.Request;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UpdateStatusBookedTourDTO {
    @Pattern(
            regexp = "^(confirmed|rejected)$",
            message = "Invalid status. Allowed values are: confirmed, rejected"
    )
    private String status;

    public UpdateStatusBookedTourDTO() {
    }

    public UpdateStatusBookedTourDTO(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
