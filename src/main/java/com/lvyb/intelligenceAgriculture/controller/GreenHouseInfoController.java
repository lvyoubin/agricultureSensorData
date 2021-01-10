package com.lvyb.intelligenceAgriculture.controller;


import com.lvyb.intelligenceAgriculture.entity.GreenHouseInfo;
import com.lvyb.intelligenceAgriculture.service.GreenHouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreenHouseInfoController {
    @Autowired
    private GreenHouseInfoService greenHouseInfoService;

    @RequestMapping(value = "/getGreenHouseInfo", method = RequestMethod.GET)
    public GreenHouseInfo getGreenHouseInfo() {
        return greenHouseInfoService.getGreenHouses();
    }

    @RequestMapping(value = "/getGreenHouseInfoById", method = RequestMethod.GET)
    public GreenHouseInfo getGreenHouseInfoById(int id) {
        return greenHouseInfoService.getGreenHouseById(id);
    }

    @RequestMapping(value = "/addGreenHouseInfo", method = RequestMethod.POST)
    public int addGreenHouseInfo(@RequestBody GreenHouseInfo greenHouseInfo) {
        return greenHouseInfoService.addGreenHouse(greenHouseInfo);
    }
}
