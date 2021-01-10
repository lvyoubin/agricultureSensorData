package com.lvyb.intelligenceAgriculture.service.impl;

import com.lvyb.intelligenceAgriculture.entity.MeasureData;
import com.lvyb.intelligenceAgriculture.mapper.MeasureDataMapper;
import com.lvyb.intelligenceAgriculture.service.MeasureDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasureDataServiceImpl implements MeasureDataService {
    @Autowired
    private MeasureDataMapper measureDataMapper;

    @Override
    public MeasureData getMeasureData() {
        return null;
    }

    @Override
    public List<MeasureData> getMeasureDataById(int id) {
        return measureDataMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addMeasureData(MeasureData measureData) {
        return measureDataMapper.insert(measureData);
    }
}
