package com.lvyb.intelligenceAgriculture.entity;

import java.util.Date;

public class DetectorData {
    private Integer detectionNo;

    private Integer greenhouseId;

    private Date detectionTime;

    private Integer temperature;

    private Integer humidity;

    private Integer co2;

    private Integer oxygen;

    private Integer nitrogen;

    public Integer getDetectionNo() {
        return detectionNo;
    }

    public void setDetectionNo(Integer detectionNo) {
        this.detectionNo = detectionNo;
    }

    public Integer getGreenhouseId() {
        return greenhouseId;
    }

    public void setGreenhouseId(Integer greenhouseId) {
        this.greenhouseId = greenhouseId;
    }

    public Date getDetectionTime() {
        return detectionTime;
    }

    public void setDetectionTime(Date detectionTime) {
        this.detectionTime = detectionTime;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCo2() {
        return co2;
    }

    public void setCo2(Integer co2) {
        this.co2 = co2;
    }

    public Integer getOxygen() {
        return oxygen;
    }

    public void setOxygen(Integer oxygen) {
        this.oxygen = oxygen;
    }

    public Integer getNitrogen() {
        return nitrogen;
    }

    public void setNitrogen(Integer nitrogen) {
        this.nitrogen = nitrogen;
    }
}