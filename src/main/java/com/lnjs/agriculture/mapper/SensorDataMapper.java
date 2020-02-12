package com.lnjs.agriculture.mapper;

import com.lnjs.agriculture.entity.SensorData;
import com.lnjs.agriculture.entity.SensorDataExample;
import com.lnjs.agriculture.entity.SensorDataWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SensorDataMapper {
    List<SensorData> getAllData();

    List<String> getRecordTime();

    List<String> getSensorAddress();

    List<String> getCOMNum();

    List<String> getMark();

    List<String> getPreserve();

    List<Long> getData00();

    List<Long> getData01();

    List<Long> getData02();

    List<Long> getData03();

    List<Long> getData04();

    List<Long> getData05();

    List<Long> getData06();

    List<Long> getData07();

    List<Long> getData08();

    List<Long> getData09();

    List<Long> getData0A();

    List<Long> getData0B();

    List<Long> getData0C();

    List<Long> getData0D();

    List<Long> getData0E();

    List<Long> getData0F();

    List<Long> getData10();

    List<Long> getData11();

    List<Long> getData12();

    List<Long> getData13();

    List<Long> getData14();

    List<Long> getData15();

    List<Long> getData16();

    List<Long> getData17();

    List<Long> getData18();

    List<Long> getData19();

    List<Long> getData1A();

    List<Long> getData1B();

    List<Long> getData1C();

    List<Long> getData1D();

    List<Long> getData1E();

    List<Long> getData1F();

    List<Long> getData20();

    List<Long> getData21();

    int insert(SensorDataWithBLOBs record);

    int insertSelective(SensorDataWithBLOBs record);

    int updateByExampleSelective(@Param("record") SensorDataWithBLOBs record, @Param("example") SensorDataExample example);

    int updateByExampleWithBLOBs(@Param("record") SensorDataWithBLOBs record, @Param("example") SensorDataExample example);

    int updateByExample(@Param("record") SensorData record, @Param("example") SensorDataExample example);
}