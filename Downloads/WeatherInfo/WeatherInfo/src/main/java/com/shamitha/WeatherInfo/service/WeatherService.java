package com.shamitha.WeatherInfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherService {

//    private static String url = "https://api.openweathermap.org/data/2.5/weather?q=London&units=metric&APPID=96345cc1b16d4128389a1fe14cd27523";
    private static String url1 = "https://api.openweathermap.org/data/2.5/weather?q=";
    private static String url2 = "&units=metric&APPID=96345cc1b16d4128389a1fe14cd27523";

    @Autowired
    private RestTemplate restTemplate;

    public Object getCityWeatherData(String city) {

            Object response = restTemplate.getForObject(url1+city+url2, Object.class);
            return response;
    }
}
