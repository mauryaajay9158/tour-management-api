package com.tourmanagement.DTOs.Response;

import com.tourmanagement.Models.Province;
import com.tourmanagement.Models.SightseeingSpot;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Wanderlust Tour & Travel Management System
 * Final Year Major Project - Bachelor of Engineering (IT), Mumbai University
 * 
 * @author Ajay Kushwaha
 */
public class SightseeingSpotRespDTO {
    private Long id;
    private String name;
    private String address;
    private ProvinceDTO province;

    public SightseeingSpotRespDTO() {
    }

    public SightseeingSpotRespDTO(Long id, String name, String address, ProvinceDTO province) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.province = province;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ProvinceDTO getProvince() {
        return province;
    }

    public void setProvince(ProvinceDTO province) {
        this.province = province;
    }

    public static SightseeingSpotRespDTO convert(SightseeingSpot sightseeingSpot) {
        SightseeingSpotRespDTO dto = new SightseeingSpotRespDTO();
        dto.setId(sightseeingSpot.getId());
        dto.setName(sightseeingSpot.getName());
        dto.setAddress(sightseeingSpot.getAddress());

        if (sightseeingSpot.getProvince() != null) {
            dto.setProvince(ProvinceDTO.convert(sightseeingSpot.getProvince()));
        }

        return dto;
    }

    public static List<SightseeingSpotRespDTO> convertList(List<SightseeingSpot> sightseeingSpots) {
        return sightseeingSpots.stream().map(SightseeingSpotRespDTO::convert).collect(Collectors.toList());
    }
}
