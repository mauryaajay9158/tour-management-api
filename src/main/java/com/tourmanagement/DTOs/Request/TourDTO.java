package com.tourmanagement.DTOs.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tourmanagement.Models.SightseeingSpot;
import com.tourmanagement.Models.TourGuide;
import com.tourmanagement.Shared.Types.EnumTransportModeTour;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;


import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class TourDTO {
    @NotNull(message = "Name cannot be null")
    private String name;

    @NotNull(message = "Duration cannot be null")
    private Integer duration;

    @NotNull(message = "Available Seats cannot be null")
    private Integer availableSeats;

    @NotNull(message = "Gathering Address cannot be null")
    private String gatheringAddress;

    @NotNull(message = "Price cannot be null")
    private Double price;

    @NotNull(message = "departure Date cannot be null")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date departureDate;

    @NotNull(message = "End Date cannot be null")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date endDate;

    private String images;

    private String departureLocation;

    private String destinationLocation;

    @NotNull(message = "Guide cannot be null")
    private Long guide_id;

    private String idSightSeeing;

    public TourDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getGatheringAddress() {
        return gatheringAddress;
    }

    public void setGatheringAddress(String gatheringAddress) {
        this.gatheringAddress = gatheringAddress;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public Long getGuide_id() {
        return guide_id;
    }

    public void setGuide_id(Long guide_id) {
        this.guide_id = guide_id;
    }

    public String getIdSightSeeing() {
        return idSightSeeing;
    }

    public void setIdSightSeeing(String idSightSeeing) {
        this.idSightSeeing = idSightSeeing;
    }
}
