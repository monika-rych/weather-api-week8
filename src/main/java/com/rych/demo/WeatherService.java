package com.rych.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    RestTemplate restTemplate;
    WeatherRepository weatherRepository;

    @Autowired
    public WeatherService(WeatherRepository weatherRepository) {
        this.restTemplate = new RestTemplate();
        this.weatherRepository = weatherRepository;
    }

    @Scheduled(fixedDelay = 60 * 60 * 1000)
    public void getWeather(){

        WeatherDetails weatherDetails = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=7794152392e0b627c1dfbe97c338b678", WeatherDetails.class);

        weatherRepository.save(weatherDetails);

   }
}
