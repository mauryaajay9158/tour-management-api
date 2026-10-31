package com.tourmanagement.Dao;

import com.tourmanagement.DTOs.Request.SearchTourDTO;
import com.tourmanagement.Models.Tour;

import java.util.List;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public interface TourDao {
    public List<Tour> searchTours(SearchTourDTO searchTourDTO);
}
