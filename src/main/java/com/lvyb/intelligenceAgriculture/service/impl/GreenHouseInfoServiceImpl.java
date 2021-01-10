package com.lvyb.intelligenceAgriculture.service.impl;

import com.lvyb.intelligenceAgriculture.entity.GreenHouseInfo;
import com.lvyb.intelligenceAgriculture.mapper.GreenHouseInfoMapper;
import com.lvyb.intelligenceAgriculture.service.GreenHouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreenHouseInfoServiceImpl implements GreenHouseInfoService {
    @Autowired
    private GreenHouseInfoMapper greenHouseInfoMapper;

    @Override
    public GreenHouseInfo getGreenHouses() {
        return null;
    }

    @Override
    public GreenHouseInfo getGreenHouseById(int id) {
        return greenHouseInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addGreenHouse(GreenHouseInfo greenHouseInfo) {
        return greenHouseInfoMapper.insert(greenHouseInfo);
    }
}
