package com.tourmanagement.DTOs.Response;

import lombok.AllArgsConstructor;
import lombok.Data;

public class TopProvinceRespDTO {
    private String province;
    private Long statistic;

    public TopProvinceRespDTO() {
    }

    public TopProvinceRespDTO(String province, Long statistic) {
        this.province = province;
        this.statistic = statistic;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Long getStatistic() {
        return statistic;
    }

    public void setStatistic(Long statistic) {
        this.statistic = statistic;
    }
}
