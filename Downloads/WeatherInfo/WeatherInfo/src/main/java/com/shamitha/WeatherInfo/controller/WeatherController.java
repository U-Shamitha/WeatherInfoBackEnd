package com.shamitha.WeatherInfo.controller;

import com.shamitha.WeatherInfo.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/weather")
@RequiredArgsConstructor
@CrossOrigin
public class WeatherController {

    private final WeatherService weatherService;
    @GetMapping
    @ResponseBody
    public ResponseEntity<Object> processForm(@RequestParam(required = true, defaultValue = "London") String city) {
        return callRapidEndPointToGetWeatherData(city);
    }

    public ResponseEntity<Object> callRapidEndPointToGetWeatherData(String city){
        return ResponseEntity.ok(weatherService.getCityWeatherData(city));

    }
}
