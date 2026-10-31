package com.tourmanagement.Repositorys;

import com.tourmanagement.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
