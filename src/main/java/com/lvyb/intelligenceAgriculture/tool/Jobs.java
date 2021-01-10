package com.lvyb.intelligenceAgriculture.tool;

import com.lvyb.intelligenceAgriculture.entity.DetectorData;
import com.lvyb.intelligenceAgriculture.mapper.DetectorDataMapper;
import com.lvyb.intelligenceAgriculture.mapper.GreenHouseInfoMapper;
import com.lvyb.intelligenceAgriculture.mapper.MeasureDataMapper;
import com.lvyb.intelligenceAgriculture.service.DetectorDataService;
import com.lvyb.intelligenceAgriculture.service.MeasureDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@PropertySource("classpath:/config.properties")    // 3.配置文件位置
public class Jobs {
    private static final Logger LOG = LoggerFactory.getLogger(Jobs.class);

    public final static long ONE_Minute =  6 * 1000;

    @Autowired
    private DetectorDataMapper detectorDataMapper;
    
    @Autowired
    private MeasureDataMapper measureDataMapper;

    @Autowired
    private GreenHouseInfoMapper greenHouseInfoMapper;

    @Autowired
    private MeasureDataService measureDataService;

    @Autowired
    private DetectorDataService detectorDataService;

    @Value("${sample.point.number}")
    private Integer samplePointNo;
    @Value("${clean.job.data.size}")
    private Integer dataSize;

//    @Scheduled(fixedRate=ONE_Minute)
    @Scheduled(cron="${clean.job.cron}")
    public int cleanData()
    {
        int result = 2;
        List<Integer> greenHouseIds = greenHouseInfoMapper.getGreenHouseIds();
        for(Integer greenHouseId : greenHouseIds) {
            LOG.info("============" + new Date() + " Start clean data greenHouseId = " + greenHouseId + " ============");

            result = detectorDataMapper.cleanDetectorData(greenHouseId, dataSize);
            measureDataMapper.cleanMeasureData(greenHouseId, dataSize);
            LOG.info("============" + new Date() + " End clean data greenHouseId = " + greenHouseId + " ============");
        }
        return result;
    }

    @Scheduled(cron="${generate.data.cron}")
    public void cronJob(){
        int greenHouseId = getGreenHouseId();
        DetectorData detectorData = new DetectorData();
        detectorData.setGreenhouseId(greenHouseId);
        detectorData.setDetectionTime(new Date());
        detectorData.setTemperature(getTemperature());
        detectorData.setHumidity(getHumidity());
        detectorData.setCo2(getCo2Data());
        detectorData.setOxygen(getOxygenData());
        detectorData.setNitrogen(getNitrogenData());
        LOG.debug(new Date()+" 生成监测数据：" + detectorData.toString());
        int result = detectorDataMapper.insert(detectorData);
        LOG.debug(new Date()+" 监测数据写入数据库，" + "result = " + result);
    }

    private int getGreenHouseId()
    {
        int max=5;
        int min=1;
        int id = (int) (Math.random()*(max-min)+min);
        return id;
    }

    private int getTemperature()
    {
        int max=40;
        int min=20;
        int bisData = (int) (Math.random()*(max-min)+min);
        return bisData;
    }
    private int getHumidity()
    {
        int max=90;
        int min=80;
        int HrData = (int) (Math.random()*(max-min)+min);
        return HrData;
    }
    private int getCo2Data()
    {
        int max=60;
        int min=40;
        int bpData = (int) (Math.random()*(max-min)+min);
        return bpData;
    }
    private int getOxygenData()
    {
        int max=30;
        int min=20;
        int SpO2Data = (int) (Math.random()*(max-min)+min);
        return SpO2Data;
    }
    private int getNitrogenData()
    {
        int max=20;
        int min=10;
        int EtCo2Data = (int) (Math.random()*(max-min)+min);
        return EtCo2Data;
    }
}
