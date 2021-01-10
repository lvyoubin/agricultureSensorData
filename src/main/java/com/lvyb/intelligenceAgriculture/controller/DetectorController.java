package com.lvyb.intelligenceAgriculture.controller;

import com.lvyb.intelligenceAgriculture.entity.DetectorData;
import com.lvyb.intelligenceAgriculture.service.DetectorDataService;
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
@PropertySource("classpath:/config.properties")    // 3.配置文件位置
public class DetectorController {
    @Autowired
    private DetectorDataService detectorDataService;

    @Value("${sample.point.number}")
    private Integer samplePointNo;

    @RequestMapping(value = "/getDetectorDataById", method = RequestMethod.GET)
    public List<DetectorData> getDetectorDataById(int id) {
        return detectorDataService.getDetectorDataById(id);
    }

    @RequestMapping(value = "/getLatestDetectorDataById", method = RequestMethod.GET)
    public List<DetectorData> getLatestDetectorDataById(int id) {
        return detectorDataService.getLatestDetectorDataById(id, samplePointNo);
    }

    @RequestMapping(value = "/addDetectorData", method = RequestMethod.POST)
    public int addDetectorData(@RequestBody DetectorData detectorData) {
        if(null == detectorData.getDetectionTime()){detectorData.setDetectionTime(new Date());}
        return detectorDataService.addDetectorData(detectorData);
    }
}
