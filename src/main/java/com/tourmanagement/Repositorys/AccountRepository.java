package com.tourmanagement.Repositorys;

import com.tourmanagement.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
