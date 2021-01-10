package com.lvyb.intelligenceAgriculture.service;

import com.lvyb.intelligenceAgriculture.entity.GreenHouseInfo;

public interface GreenHouseInfoService {
    GreenHouseInfo getGreenHouses();

    GreenHouseInfo getGreenHouseById(int id);

    int addGreenHouse(GreenHouseInfo greenHouseInfo);
}
