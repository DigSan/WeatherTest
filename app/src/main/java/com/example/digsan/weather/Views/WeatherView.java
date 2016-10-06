package com.example.digsan.weather.Views;

import com.example.digsan.weather.Models.weather.Forecast;
import com.example.digsan.weather.Models.weather.Results;

import java.util.List;

/**
 * Created by digsan on 05.10.2016.
 */

public interface WeatherView {
    void showWeather(Results weatherForDays);
}
