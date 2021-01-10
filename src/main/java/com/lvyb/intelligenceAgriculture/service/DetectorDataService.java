package com.lvyb.intelligenceAgriculture.service;

import com.lvyb.intelligenceAgriculture.entity.DetectorData;

import java.util.List;

public interface DetectorDataService {
    DetectorData getDetectorData();

    List<DetectorData> getDetectorDataById(int id);

    int addDetectorData(DetectorData detectorData);

    List<DetectorData> getLatestDetectorDataById(int id, int samplePointNo);
}
