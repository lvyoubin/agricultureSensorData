package com.lnjs.agriculture.service.impl;

import com.lnjs.agriculture.mapper.SensorDataMapper;
import com.lnjs.agriculture.entity.SensorData;
import com.lnjs.agriculture.service.ISensorDataService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SensorDataServiceImpl implements ISensorDataService {

    @Autowired
    private SensorDataMapper sensorDataMapper;

    @Override
    public List<SensorData> getAllData() {
        return sensorDataMapper.getAllData();
    }

    @Override
    public List<String> getRecordTime() {
        List<String> recordTimeList = sensorDataMapper.getRecordTime();
        List<String> newRecordTimeList = new ArrayList<>(recordTimeList.size());
        for (String time: recordTimeList) {
            newRecordTimeList.add(StringUtils.substringBefore(time,"."));
        }
        return newRecordTimeList;
    }

    @Override
    public List<String> getSensorAddress() {
        return sensorDataMapper.getSensorAddress();
    }

    @Override
    public List<String> getComNum() {
        return sensorDataMapper.getComNum();
    }

    @Override
    public List<String> getMark() {
        return sensorDataMapper.getMark();
    }

    @Override
    public List<String> getPreserve() {
        return sensorDataMapper.getPreserve();
    }

    @Override
    public List<Long> getData00() {
        return sensorDataMapper.getData00();
    }

    @Override
    public List<Long> getData01() {
        return sensorDataMapper.getData01();
    }

    @Override
    public List<Long> getData02() {
        return sensorDataMapper.getData02();
    }

    @Override
    public List<Long> getData03() {
        return sensorDataMapper.getData03();
    }

    @Override
    public List<Long> getData04() {
        return sensorDataMapper.getData04();
    }

    @Override
    public List<Long> getData05() {
        return sensorDataMapper.getData05();
    }

    @Override
    public List<Long> getData06() {
        return sensorDataMapper.getData06();
    }

    @Override
    public List<Long> getData07() {
        return sensorDataMapper.getData07();
    }

    @Override
    public List<Long> getData08() {
        return sensorDataMapper.getData08();
    }

    @Override
    public List<Long> getData09() {
        return sensorDataMapper.getData09();
    }

    @Override
    public List<Long> getData0A() {
        return sensorDataMapper.getData0A();
    }

    @Override
    public List<Long> getData0B() {
        return sensorDataMapper.getData0B();
    }

    @Override
    public List<Long> getData0C() {
        return sensorDataMapper.getData0C();
    }

    @Override
    public List<Long> getData0D() {
        return sensorDataMapper.getData0D();
    }

    @Override
    public List<Long> getData0E() {
        return sensorDataMapper.getData0E();
    }

    @Override
    public List<Long> getData0F() {
        return sensorDataMapper.getData0F();
    }

    @Override
    public List<Long> getData10() {
        return sensorDataMapper.getData10();
    }

    @Override
    public List<Long> getData11() {
        return sensorDataMapper.getData11();
    }

    @Override
    public List<Long> getData12() {
        return sensorDataMapper.getData12();
    }

    @Override
    public List<Long> getData13() {
        return sensorDataMapper.getData13();
    }

    @Override
    public List<Long> getData14() {
        return sensorDataMapper.getData14();
    }

    @Override
    public List<Long> getData15() {
        return sensorDataMapper.getData15();
    }

    @Override
    public List<Long> getData16() {
        return sensorDataMapper.getData16();
    }

    @Override
    public List<Long> getData17() {
        return sensorDataMapper.getData17();
    }

    @Override
    public List<Long> getData18() {
        return sensorDataMapper.getData18();
    }

    @Override
    public List<Long> getData19() {
        return sensorDataMapper.getData19();
    }

    @Override
    public List<Long> getData1A() {
        return sensorDataMapper.getData1A();
    }

    @Override
    public List<Long> getData1B() {
        return sensorDataMapper.getData1B();
    }

    @Override
    public List<Long> getData1C() {
        return sensorDataMapper.getData1C();
    }

    @Override
    public List<Long> getData1D() {
        return sensorDataMapper.getData1D();
    }

    @Override
    public List<Long> getData1E() {
        return sensorDataMapper.getData1E();
    }

    @Override
    public List<Long> getData1F() {
        return sensorDataMapper.getData1F();
    }

    @Override
    public List<Long> getData20() {
        return sensorDataMapper.getData20();
    }

    @Override
    public List<Long> getData21() {
        return sensorDataMapper.getData21();
    }
}
