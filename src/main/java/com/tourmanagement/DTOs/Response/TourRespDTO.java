package com.tourmanagement.DTOs.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tourmanagement.Models.SightseeingSpot;
import com.tourmanagement.Models.TourGuide;
import com.tourmanagement.Shared.Types.EnumTransportModeTour;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class TourRespDTO {
    private Long id;
    private String name;
    @JsonFormat(pattern = "dd/MM/yyyy", timezone = "GMT+7")
    private Date departureDate;
    @JsonFormat(pattern = "dd/MM/yyyy", timezone = "GMT+7")
    private Date endDate;
    private Integer duration;
    private String departureLocation;
    private String destinationLocation;
    private TourGuide guide;
    private Integer availableSeats;
    private String gatheringAddress;
    private EnumTransportModeTour transportationMode = EnumTransportModeTour.BUS;
    private List<String> images;
    private List<SightseeingSpot> sightseeingSpots;
    private Integer likes;
    private Integer views;
    private Double price;
    private Double rating;

    public TourRespDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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

    public TourGuide getGuide() {
        return guide;
    }

    public void setGuide(TourGuide guide) {
        this.guide = guide;
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

    public EnumTransportModeTour getTransportationMode() {
        return transportationMode;
    }

    public void setTransportationMode(EnumTransportModeTour transportationMode) {
        this.transportationMode = transportationMode;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<SightseeingSpot> getSightseeingSpots() {
        return sightseeingSpots;
    }

    public void setSightseeingSpots(List<SightseeingSpot> sightseeingSpots) {
        this.sightseeingSpots = sightseeingSpots;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
