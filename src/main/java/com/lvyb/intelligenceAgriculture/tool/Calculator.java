package com.lvyb.intelligenceAgriculture.tool;

import com.lvyb.intelligenceAgriculture.entity.DetectorData;
import com.lvyb.intelligenceAgriculture.entity.GreenHouseInfo;

/**
 * 计算用药量
 */
public class Calculator {
    /*
    计算水量
     */
    public static int getWater(DetectorData detectorData, GreenHouseInfo greenHouseInfo)
    {
        return 0;
    }

    /*
    计算光照
     */
    public static int getIllumination(DetectorData detectorData, GreenHouseInfo greenHouseInfo)
    {
        return 5;
    }

    /*
    计算喷药量
     */
    public static int getSpray(DetectorData detectorData, GreenHouseInfo greenHouseInfo)
    {
        return 10;
    }
}
