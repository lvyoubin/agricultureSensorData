package com.lvyb.intelligenceAgriculture.entity;

import java.util.Date;

public class MeasureData {
    private Integer measureNo;

    private Integer greenhouseId;

    private Date measureTime;

    private Integer water;

    private Integer illumination;

    private Integer spray;

    public Integer getMeasureNo() {
        return measureNo;
    }

    public void setMeasureNo(Integer measureNo) {
        this.measureNo = measureNo;
    }

    public Integer getGreenhouseId() {
        return greenhouseId;
    }

    public void setGreenhouseId(Integer greenhouseId) {
        this.greenhouseId = greenhouseId;
    }

    public Date getMeasureTime() {
        return measureTime;
    }

    public void setMeasureTime(Date measureTime) {
        this.measureTime = measureTime;
    }

    public Integer getWater() {
        return water;
    }

    public void setWater(Integer water) {
        this.water = water;
    }

    public Integer getIllumination() {
        return illumination;
    }

    public void setIllumination(Integer illumination) {
        this.illumination = illumination;
    }

    public Integer getSpray() {
        return spray;
    }

    public void setSpray(Integer spray) {
        this.spray = spray;
    }
}