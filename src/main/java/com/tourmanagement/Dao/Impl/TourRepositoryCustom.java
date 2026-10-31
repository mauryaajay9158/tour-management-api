package com.tourmanagement.Dao.Impl;

import com.tourmanagement.Models.Tour;

import java.util.List;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public interface TourRepositoryCustom {
    List<Tour> findToursBySightseeingId(Long sightseeingId);
}
