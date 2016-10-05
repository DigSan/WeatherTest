package com.example.digsan.weather.Views;

import com.example.digsan.weather.Models.weather.Forecast;

import java.util.List;


/**
 * Created by digsan on 05.10.2016.
 */

public class WeatherViewImp implements WeatherView {
    private final WeatherViewHolder weatherViewHolder;

    public WeatherViewImp(final WeatherViewHolder viewHolder) {
        this.weatherViewHolder = viewHolder;
    }

    @Override
    public void showWeather(List<Forecast> weatherForDays) {
        weatherViewHolder.day.setText(weatherForDays.get(0).getDay());
    }
}
