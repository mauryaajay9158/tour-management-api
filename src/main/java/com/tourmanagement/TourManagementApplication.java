package com.tourmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
@EnableAspectJAutoProxy
@SpringBootApplication
public class TourManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourManagementApplication.class, args);
	}
}
