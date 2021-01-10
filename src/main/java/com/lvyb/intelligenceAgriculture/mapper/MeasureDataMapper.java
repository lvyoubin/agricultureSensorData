package com.lvyb.intelligenceAgriculture.mapper;

import com.lvyb.intelligenceAgriculture.entity.MeasureData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MeasureDataMapper {
    int deleteByPrimaryKey(Integer measureNo);

    int insert(MeasureData record);

    int insertSelective(MeasureData record);

    List<MeasureData> selectByPrimaryKey(Integer measureNo);

    int updateByPrimaryKeySelective(MeasureData record);

    int updateByPrimaryKey(MeasureData record);

    int cleanMeasureData(@Param("greenhouseId")Integer greenhouseId, @Param("dataSize")Integer dataSize);
}