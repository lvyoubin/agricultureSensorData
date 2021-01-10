package com.lvyb.intelligenceAgriculture.mapper;

import com.lvyb.intelligenceAgriculture.entity.GreenHouseInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GreenHouseInfoMapper {
    int deleteByPrimaryKey(Integer greenhouseId);

    int insert(GreenHouseInfo record);

    int insertSelective(GreenHouseInfo record);

    GreenHouseInfo selectByPrimaryKey(Integer greenhouseId);

    int updateByPrimaryKeySelective(GreenHouseInfo record);

    int updateByPrimaryKey(GreenHouseInfo record);

    List<Integer> getGreenHouseIds();
}