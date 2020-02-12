package com.lnjs.agriculture.entity;

import com.lnjs.agriculture.entity.SensorData;

public class SensorDataWithBLOBs extends SensorData {
    private String comnum;

    private String mark;

    private String preserve;

    public String getComnum() {
        return comnum;
    }

    public void setComnum(String comnum) {
        this.comnum = comnum;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getPreserve() {
        return preserve;
    }

    public void setPreserve(String preserve) {
        this.preserve = preserve;
    }
}