package com.example.digsan.weather.Models;

import com.example.digsan.weather.Models.WeatherModel;
import com.example.digsan.weather.Models.weather.WeatherResponse;
import com.example.digsan.weather.Services.YahooWeather;

import java.util.Formatter;

import rx.Observable;
import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 * Created by digsan on 05.10.2016.
 */

public class WeatherModelImp implements WeatherModel {

    public WeatherModelImp() {
    }


    @Override
    public Observable<WeatherResponse> gerWeatherData(String city) {
        String query = String.format("select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"%1$s\")",city);
        return YahooWeather.getInstance().getBookingService().getWeatherData(query, "json")
                ;
    }
}