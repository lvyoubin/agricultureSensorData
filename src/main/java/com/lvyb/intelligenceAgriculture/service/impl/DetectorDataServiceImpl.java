package com.lvyb.intelligenceAgriculture.service.impl;

import com.lvyb.intelligenceAgriculture.entity.DetectorData;
import com.lvyb.intelligenceAgriculture.mapper.DetectorDataMapper;
import com.lvyb.intelligenceAgriculture.service.DetectorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetectorDataServiceImpl implements DetectorDataService {
    @Autowired
    private DetectorDataMapper detectorDataMapper;

    @Override
    public DetectorData getDetectorData() {
        return null;
    }

    @Override
    public List<DetectorData> getDetectorDataById(int id) {
        return detectorDataMapper.selectByGreenhouseId(id);
    }

    @Override
    public int addDetectorData(DetectorData detectorData) {
        return detectorDataMapper.insert(detectorData);
    }

    @Override
    public List<DetectorData> getLatestDetectorDataById(int id, int samplePointNo) {
        return detectorDataMapper.getLatestDetectorDataById(id, samplePointNo);
    }
}
