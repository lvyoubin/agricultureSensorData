package com.lvyb.intelligenceAgriculture.mapper;

import com.lvyb.intelligenceAgriculture.entity.DetectorData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DetectorDataMapper {
    int deleteByPrimaryKey(Integer detectionNo);
    int deleteByGreenhouseId(Integer detectionNo);

    int insert(DetectorData record);

    List<DetectorData> selectByPrimaryKey(Integer detectionNo);

    List<DetectorData> selectByGreenhouseId(Integer greenhouseId);

    List<DetectorData> getLatestDetectorDataById(@Param("greenhouseId")Integer greenhouseId, @Param("samplePointNo") Integer samplePointNo);

    int cleanDetectorData(@Param("greenhouseId")Integer greenhouseId, @Param("dataSize")Integer dataSize);
}