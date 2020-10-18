package com.rych.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WeatherApiWeek8Application {

    public static void main(String[] args) {
        SpringApplication.run(WeatherApiWeek8Application.class, args);
    }

}
