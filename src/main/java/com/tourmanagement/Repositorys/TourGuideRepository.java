package com.tourmanagement.Repositorys;

import com.tourmanagement.Models.Discount;
import com.tourmanagement.Models.TourGuide;
import com.tourmanagement.Shared.Types.EnumStatusDiscount;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public interface TourGuideRepository extends JpaRepository<TourGuide, Long> {

}
