package com.example.digsan.weather.Models;

import com.example.digsan.weather.Models.weather.WeatherResponse;
import com.example.digsan.weather.Services.YahooWeather;


import io.reactivex.Observable;


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