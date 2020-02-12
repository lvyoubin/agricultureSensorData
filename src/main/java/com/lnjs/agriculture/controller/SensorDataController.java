package com.lnjs.agriculture.controller;

import com.lnjs.agriculture.entity.SensorData;
import com.lnjs.agriculture.service.ISensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SensorDataController {
    @Autowired
    private ISensorDataService sensorDataService;

    @RequestMapping(value = "/getAllData", method = RequestMethod.GET)
    public List<SensorData> getAllData() {
        return sensorDataService.getAllData();
    }

    @RequestMapping(value = "/getRecordTime", method = RequestMethod.GET)
    public List<String> getRecordTime() {
        return sensorDataService.getRecordTime();
    }

    @RequestMapping(value = "getSensorAddress", method = RequestMethod.GET)
    public List<String> getSensorAddress() {
        return sensorDataService.getSensorAddress();
    }

    @RequestMapping(value = "getComNum", method = RequestMethod.GET)
    public List<String> getComNum() {
        return sensorDataService.getComNum();
    }

    @RequestMapping(value = "getMark", method = RequestMethod.GET)
    public List<String> getMark() {
        return sensorDataService.getMark();
    }

    @RequestMapping(value = "getPreserve", method = RequestMethod.GET)
    public List<String> getPreserve() {
        return sensorDataService.getPreserve();
    }

    @RequestMapping(value = "getData00", method = RequestMethod.GET)
    public List<Long> getData00() {
        return sensorDataService.getData00();
    }

    @RequestMapping(value = "getData01", method = RequestMethod.GET)
    public List<Long> getData01() {
        return sensorDataService.getData01();
    }

    @RequestMapping(value = "getData02", method = RequestMethod.GET)
    public List<Long> getData02() {
        return sensorDataService.getData02();
    }

    @RequestMapping(value = "getData03", method = RequestMethod.GET)
    public List<Long> getData03() {
        return sensorDataService.getData03();
    }

    @RequestMapping(value = "getData04", method = RequestMethod.GET)
    public List<Long> getData04() {
        return sensorDataService.getData04();
    }

    @RequestMapping(value = "getData05", method = RequestMethod.GET)
    public List<Long> getData05() {
        return sensorDataService.getData05();
    }

    @RequestMapping(value = "getData06", method = RequestMethod.GET)
    public List<Long> getData06() {
        return sensorDataService.getData06();
    }

    @RequestMapping(value = "getData07", method = RequestMethod.GET)
    public List<Long> getData07() {
        return sensorDataService.getData07();
    }

    @RequestMapping(value = "getData08", method = RequestMethod.GET)
    public List<Long> getData08() {
        return sensorDataService.getData08();
    }

    @RequestMapping(value = "getData09", method = RequestMethod.GET)
    public List<Long> getData09() {
        return sensorDataService.getData09();
    }

    @RequestMapping(value = "getData0A", method = RequestMethod.GET)
    public List<Long> getData0A() {
        return sensorDataService.getData0A();
    }

    @RequestMapping(value = "getData0B", method = RequestMethod.GET)
    public List<Long> getData0B() {
        return sensorDataService.getData0B();
    }

    @RequestMapping(value = "getData0C", method = RequestMethod.GET)
    public List<Long> getData0C() {
        return sensorDataService.getData0C();
    }

    @RequestMapping(value = "getData0D", method = RequestMethod.GET)
    public List<Long> getData0D() {
        return sensorDataService.getData0D();
    }

    @RequestMapping(value = "getData0E", method = RequestMethod.GET)
    public List<Long> getData0E() {
        return sensorDataService.getData0E();
    }

    @RequestMapping(value = "getData0F", method = RequestMethod.GET)
    public List<Long> getData0F() {
        return sensorDataService.getData0F();
    }

    @RequestMapping(value = "getData10", method = RequestMethod.GET)
    public List<Long> getData10() {
        return sensorDataService.getData10();
    }

    @RequestMapping(value = "getData11", method = RequestMethod.GET)
    public List<Long> getData11() {
        return sensorDataService.getData11();
    }

    @RequestMapping(value = "getData12", method = RequestMethod.GET)
    public List<Long> getData12() {
        return sensorDataService.getData12();
    }

    @RequestMapping(value = "getData13", method = RequestMethod.GET)
    public List<Long> getData13() {
        return sensorDataService.getData13();
    }

    @RequestMapping(value = "getData14", method = RequestMethod.GET)
    public List<Long> getData14() {
        return sensorDataService.getData14();
    }

    @RequestMapping(value = "getData15", method = RequestMethod.GET)
    public List<Long> getData15() {
        return sensorDataService.getData15();
    }

    @RequestMapping(value = "getData16", method = RequestMethod.GET)
    public List<Long> getData16() {
        return sensorDataService.getData16();
    }

    @RequestMapping(value = "getData17", method = RequestMethod.GET)
    public List<Long> getData17() {
        return sensorDataService.getData17();
    }

    @RequestMapping(value = "getData18", method = RequestMethod.GET)
    public List<Long> getData18() {
        return sensorDataService.getData18();
    }

    @RequestMapping(value = "getData19", method = RequestMethod.GET)
    public List<Long> getData19() {
        return sensorDataService.getData19();
    }

    @RequestMapping(value = "getData1A", method = RequestMethod.GET)
    public List<Long> getData1a() {
        return sensorDataService.getData1A();
    }

    @RequestMapping(value = "getData1B", method = RequestMethod.GET)
    public List<Long> getData1b() {
        return sensorDataService.getData1B();
    }

    @RequestMapping(value = "getData1C", method = RequestMethod.GET)
    public List<Long> getData1c() {
        return sensorDataService.getData1C();
    }

    @RequestMapping(value = "getData1D", method = RequestMethod.GET)
    public List<Long> getData1d() {
        return sensorDataService.getData1D();
    }

    @RequestMapping(value = "getData1E", method = RequestMethod.GET)
    public List<Long> getData1e() {
        return sensorDataService.getData1E();
    }

    @RequestMapping(value = "getData1F", method = RequestMethod.GET)
    public List<Long> getData1f() {
        return sensorDataService.getData1F();
    }

    @RequestMapping(value = "getData20", method = RequestMethod.GET)
    public List<Long> getData20() {
        return sensorDataService.getData20();
    }

    @RequestMapping(value = "getData21", method = RequestMethod.GET)
    public List<Long> getData21() {
        return sensorDataService.getData21();
    }
}
