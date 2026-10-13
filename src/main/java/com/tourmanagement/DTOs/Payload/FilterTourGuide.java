package com.tourmanagement.DTOs.Payload;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class FilterTourGuide {

    @PositiveOrZero(message = "Page must be a positive number or Zero number")
    @NotNull(message = "Page cannot be null")
    private int page;
    @Positive(message = "Items per page must be a positive number")
    @NotNull(message = "ItemsPerPage cannot be null")
    private int itemsPerPage;

    public FilterTourGuide() {
    }

    public FilterTourGuide(int page, int itemsPerPage) {
        this.page = page;
        this.itemsPerPage = itemsPerPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }
}
