package com.tourmanagement.Models;

import com.fasterxml.jackson.annotation.*;
import com.tourmanagement.Shared.Types.EnumStatusTour;
import com.tourmanagement.Shared.Types.EnumTransportModeTour;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Table(name = "tours")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, name = "departure_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date departureDate;

    @Column(nullable = true, name = "end_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date endDate;

    @Column(nullable = false)
    private Integer duration;

    @Column(columnDefinition = "TEXT")
    private String departureLocation;

    @Column(columnDefinition = "TEXT", name = "destination_location")
    private String destinationLocation;

    @Column(name = "registered_seats", nullable = false)
    private Integer registeredSeats = 0;

    @Column(name = "available_seats", nullable = false)
    private Integer availableSeats;

    @Column(columnDefinition = "TEXT", name = "sightseeing_id_list")
    private String idSightSeeing;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "guide_id")
    private TourGuide guide;

    @Column(nullable = false, name = "gathering_address")
    private String gatheringAddress;

    @Enumerated(EnumType.STRING)
    private EnumTransportModeTour transportationMode = EnumTransportModeTour.BUS;

    @Column(columnDefinition = "TEXT")
    private String images;

    @Column(columnDefinition = "INT DEFAULT 0")
    private Integer likes = 0;

    @Column(columnDefinition = "INT DEFAULT 0")
    private Integer views = 0;

    @Column(columnDefinition = "DOUBLE PRECISION", nullable = false)
    private Double price;

    @Column(columnDefinition = "DOUBLE PRECISION DEFAULT 0.0")
    private Double rating = 0.0;

    @Enumerated(EnumType.STRING)
    private EnumStatusTour status;

    public Tour() {
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

    public Integer getRegisteredSeats() {
        return registeredSeats;
    }

    public void setRegisteredSeats(Integer registeredSeats) {
        this.registeredSeats = registeredSeats;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getIdSightSeeing() {
        return idSightSeeing;
    }

    public void setIdSightSeeing(String idSightSeeing) {
        this.idSightSeeing = idSightSeeing;
    }

    public TourGuide getGuide() {
        return guide;
    }

    public void setGuide(TourGuide guide) {
        this.guide = guide;
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
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

    public EnumStatusTour getStatus() {
        return status;
    }

    public void setStatus(EnumStatusTour status) {
        this.status = status;
    }
}
