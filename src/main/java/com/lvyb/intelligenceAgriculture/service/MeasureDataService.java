package com.lvyb.intelligenceAgriculture.service;

import com.lvyb.intelligenceAgriculture.entity.MeasureData;

import java.util.List;

public interface MeasureDataService {
    MeasureData getMeasureData();

    List<MeasureData> getMeasureDataById(int id);

    int addMeasureData(MeasureData measureData);
}
