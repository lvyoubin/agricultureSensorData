package com.lvyb.intelligenceAgriculture.controller;

import com.lvyb.intelligenceAgriculture.entity.*;
import com.lvyb.intelligenceAgriculture.service.DetectorDataService;
import com.lvyb.intelligenceAgriculture.service.MeasureDataService;
import com.lvyb.intelligenceAgriculture.service.GreenHouseInfoService;
import com.lvyb.intelligenceAgriculture.tool.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
@PropertySource("classpath:/config.properties")
public class MeasureController {
    private static final Logger LOG = LoggerFactory.getLogger(MeasureController.class);

    //标记是诱导阶段（true） 或 麻醉阶段（false）
    private boolean statusFlag = true;
    @Autowired
    private MeasureDataService measureDataService;

    @Autowired
    private DetectorDataService detectorDataService;

    @Autowired
    private GreenHouseInfoService greenHouseInfoService;

    @Value("${sample.point.number}")
    private Integer samplePointNo;

    @RequestMapping(value = "/getMeasureDataById", method = RequestMethod.GET)
    public List<MeasureData> getMeasureDataById(int id) {
        return measureDataService.getMeasureDataById(id);
    }

    @RequestMapping(value = "/addMeasureData", method = RequestMethod.POST)
    public int addMeasureData(@RequestBody MeasureData measureData) {
        return measureDataService.addMeasureData(measureData);
    }

    @RequestMapping(value = "/addMeasureDataById", method = RequestMethod.GET)
    public MeasureData addMeasureDataById(int greenhouseId) {
        MeasureData measureData = calculateMeasureData(greenhouseId);

        //向端口写入
        //SerialPort.serialPort(measureData.get());
        ////向端口写
//        System.out.println(new Date()+"向端口写入用药量：" + measureData.toString());
//        SerialPort.serialPort(measureData.toString());

        //向数据库写入
        LOG.info(new Date()+"数据库写入：" + measureData.toString());
        measureDataService.addMeasureData(measureData);

        return measureData;
    }

    private MeasureData calculateMeasureData(int greenhouseId)
    {
        DetectorData avgDetectorData = getAvgDetectorData(greenhouseId);
        GreenHouseInfo greenHouseInfo = greenHouseInfoService.getGreenHouseById(greenhouseId);

        MeasureData measureData = new MeasureData();
        measureData.setGreenhouseId(avgDetectorData.getGreenhouseId());
        measureData.setMeasureTime(new Date());
        measureData.setWater(Calculator.getWater(avgDetectorData, greenHouseInfo));

        measureData.setIllumination(Calculator.getIllumination(avgDetectorData, greenHouseInfo));
        measureData.setSpray(Calculator.getSpray(avgDetectorData, greenHouseInfo));
        return measureData;
    }

    //计算N(配置文件中配置sample.point.number)次监测仪监测数据的平均值
    private DetectorData getAvgDetectorData(int id) {
        List<DetectorData> detectorDataList = detectorDataService.getLatestDetectorDataById(id, samplePointNo);

        DetectorData avgDetectorData = new DetectorData();

        int sumTemperature = 0;
        int sumHumidity = 0;
        int sumCo2 = 0;
        int sumOxygen = 0;
        int sumNitrogen = 0;

        for(DetectorData detectorData: detectorDataList)
        {
            sumTemperature += detectorData.getTemperature();
            sumHumidity += detectorData.getHumidity();
            sumCo2 += detectorData.getCo2();
            sumOxygen += detectorData.getOxygen();
            sumNitrogen += detectorData.getNitrogen();
            avgDetectorData.setGreenhouseId(detectorData.getGreenhouseId());
        }

        int avgTemperature = sumTemperature/detectorDataList.size();
        int avgHumidity = sumHumidity/detectorDataList.size();
        int avgCo2 = sumCo2/detectorDataList.size();
        int avgOxygen = sumOxygen/detectorDataList.size();
        int avgNitrogen = sumNitrogen/detectorDataList.size();

        avgDetectorData.setTemperature(avgTemperature);
        avgDetectorData.setHumidity(avgHumidity);
        avgDetectorData.setCo2(avgCo2);
        avgDetectorData.setOxygen(avgOxygen);
        avgDetectorData.setNitrogen(avgNitrogen);

        return avgDetectorData;
    }
}
