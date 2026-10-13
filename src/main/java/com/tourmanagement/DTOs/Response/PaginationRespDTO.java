package com.tourmanagement.DTOs.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class PaginationRespDTO<T> {
    private Long total;
    private int page;
    private int itemsPerPage;
    private List<T> data;

    public PaginationRespDTO() {
    }

    public PaginationRespDTO(Long total, int page, int itemsPerPage, List<T> data) {
        this.total = total;
        this.page = page;
        this.itemsPerPage = itemsPerPage;
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
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

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
