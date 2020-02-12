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
    private ISensorDataService userService;

    @RequestMapping(value = "/getAllData", method = RequestMethod.GET)
    public List<SensorData> getAllData() {
        return userService.getAllData();
    }

    @RequestMapping(value = "/getRecordTime", method = RequestMethod.GET)
    public List<String> getRecordTime() {
        return userService.getRecordTime();
    }

    @RequestMapping(value = "getSensorAddress", method = RequestMethod.GET)
    public List<String> getSensorAddress() {
        return userService.getSensorAddress();
    }

    @RequestMapping(value = "getCOMNum", method = RequestMethod.GET)
    public List<String> getCOMNum() {
        return userService.getCOMNum();
    }

    @RequestMapping(value = "getMark", method = RequestMethod.GET)
    public List<String> getMark() {
        return userService.getMark();
    }

    @RequestMapping(value = "getPreserve", method = RequestMethod.GET)
    public List<String> getPreserve() {
        return userService.getPreserve();
    }

    @RequestMapping(value = "getData00", method = RequestMethod.GET)
    public List<Long> getData00() {
        return userService.getData00();
    }

    @RequestMapping(value = "getData01", method = RequestMethod.GET)
    public List<Long> getData01() {
        return userService.getData01();
    }

    @RequestMapping(value = "getData02", method = RequestMethod.GET)
    public List<Long> getData02() {
        return userService.getData02();
    }

    @RequestMapping(value = "getData03", method = RequestMethod.GET)
    public List<Long> getData03() {
        return userService.getData03();
    }

    @RequestMapping(value = "getData04", method = RequestMethod.GET)
    public List<Long> getData04() {
        return userService.getData04();
    }

    @RequestMapping(value = "getData05", method = RequestMethod.GET)
    public List<Long> getData05() {
        return userService.getData05();
    }

    @RequestMapping(value = "getData06", method = RequestMethod.GET)
    public List<Long> getData06() {
        return userService.getData06();
    }

    @RequestMapping(value = "getData07", method = RequestMethod.GET)
    public List<Long> getData07() {
        return userService.getData07();
    }

    @RequestMapping(value = "getData08", method = RequestMethod.GET)
    public List<Long> getData08() {
        return userService.getData08();
    }

    @RequestMapping(value = "getData09", method = RequestMethod.GET)
    public List<Long> getData09() {
        return userService.getData09();
    }

    @RequestMapping(value = "getData0A", method = RequestMethod.GET)
    public List<Long> getData0A() {
        return userService.getData0A();
    }

    @RequestMapping(value = "getData0B", method = RequestMethod.GET)
    public List<Long> getData0B() {
        return userService.getData0B();
    }

    @RequestMapping(value = "getData0C", method = RequestMethod.GET)
    public List<Long> getData0C() {
        return userService.getData0C();
    }

    @RequestMapping(value = "getData0D", method = RequestMethod.GET)
    public List<Long> getData0D() {
        return userService.getData0D();
    }

    @RequestMapping(value = "getData0E", method = RequestMethod.GET)
    public List<Long> getData0E() {
        return userService.getData0E();
    }

    @RequestMapping(value = "getData0F", method = RequestMethod.GET)
    public List<Long> getData0F() {
        return userService.getData0F();
    }

    @RequestMapping(value = "getData10", method = RequestMethod.GET)
    public List<Long> getData10() {
        return userService.getData10();
    }

    @RequestMapping(value = "getData11", method = RequestMethod.GET)
    public List<Long> getData11() {
        return userService.getData11();
    }

    @RequestMapping(value = "getData12", method = RequestMethod.GET)
    public List<Long> getData12() {
        return userService.getData12();
    }

    @RequestMapping(value = "getData13", method = RequestMethod.GET)
    public List<Long> getData13() {
        return userService.getData13();
    }

    @RequestMapping(value = "getData14", method = RequestMethod.GET)
    public List<Long> getData14() {
        return userService.getData14();
    }

    @RequestMapping(value = "getData15", method = RequestMethod.GET)
    public List<Long> getData15() {
        return userService.getData15();
    }

    @RequestMapping(value = "getData16", method = RequestMethod.GET)
    public List<Long> getData16() {
        return userService.getData16();
    }

    @RequestMapping(value = "getData17", method = RequestMethod.GET)
    public List<Long> getData17() {
        return userService.getData17();
    }

    @RequestMapping(value = "getData18", method = RequestMethod.GET)
    public List<Long> getData18() {
        return userService.getData18();
    }

    @RequestMapping(value = "getData19", method = RequestMethod.GET)
    public List<Long> getData19() {
        return userService.getData19();
    }

    @RequestMapping(value = "getData1A", method = RequestMethod.GET)
    public List<Long> getData1a() {
        return userService.getData1A();
    }

    @RequestMapping(value = "getData1B", method = RequestMethod.GET)
    public List<Long> getData1b() {
        return userService.getData1B();
    }

    @RequestMapping(value = "getData1C", method = RequestMethod.GET)
    public List<Long> getData1c() {
        return userService.getData1C();
    }

    @RequestMapping(value = "getData1D", method = RequestMethod.GET)
    public List<Long> getData1d() {
        return userService.getData1D();
    }

    @RequestMapping(value = "getData1E", method = RequestMethod.GET)
    public List<Long> getData1e() {
        return userService.getData1E();
    }

    @RequestMapping(value = "getData1F", method = RequestMethod.GET)
    public List<Long> getData1f() {
        return userService.getData1F();
    }

    @RequestMapping(value = "getData20", method = RequestMethod.GET)
    public List<Long> getData20() {
        return userService.getData20();
    }

    @RequestMapping(value = "getData21", method = RequestMethod.GET)
    public List<Long> getData21() {
        return userService.getData21();
    }
}
