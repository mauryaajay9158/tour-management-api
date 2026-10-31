package com.tourmanagement.DTOs.Payload;

import lombok.Data;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class PaginationRequest {
    private int page = 0;
    private int itemsPerPage = 10;

    public PaginationRequest() {
    }

    public PaginationRequest(int page, int itemsPerPage) {
        this.page = Math.max(page, 0);
        this.itemsPerPage = itemsPerPage <= 0 ? 10 : itemsPerPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = Math.max(page, 0);
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage <= 0 ? 10 : itemsPerPage;
    }
}
