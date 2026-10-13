package com.tourmanagement.DTOs.Response;

import com.tourmanagement.Models.Province;
import lombok.Data;

public class ProvinceDTO {
    private Long id;
    private String name;
    private String codename;

    public ProvinceDTO() {
    }

    public ProvinceDTO(Long id, String name, String codename) {
        this.id = id;
        this.name = name;
        this.codename = codename;
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

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public static ProvinceDTO convert(Province province) {
        ProvinceDTO dto = new ProvinceDTO();
        dto.setId(province.getId());
        dto.setName(province.getName());
        dto.setCodename(province.getCodename());
        return dto;
    }
}