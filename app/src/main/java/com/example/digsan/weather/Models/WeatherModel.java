package com.example.digsan.weather.Models;

import com.example.digsan.weather.Models.weather.WeatherResponse;

import io.reactivex.Observable;

/**
 * Created by digsan on 05.10.2016.
 */

public interface WeatherModel {
    Observable<WeatherResponse> gerWeatherData(String query);
}
