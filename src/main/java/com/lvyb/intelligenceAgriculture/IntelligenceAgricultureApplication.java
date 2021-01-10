package com.lvyb.intelligenceAgriculture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IntelligenceAgricultureApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntelligenceAgricultureApplication.class, args);
    }

}
