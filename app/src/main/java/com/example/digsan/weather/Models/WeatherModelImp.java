package com.example.digsan.weather.Models;

import com.example.digsan.weather.Models.WeatherModel;
import com.example.digsan.weather.Models.weather.WeatherResponse;
import com.example.digsan.weather.Services.YahooWeather;

import rx.Observable;

/**
 * Created by digsan on 05.10.2016.
 */

public class WeatherModelImp implements WeatherModel {

    public WeatherModelImp() {
    }


    @Override
    public Observable<WeatherResponse> gerWeatherData() {
        String query = "select * from weather.forecast where woeid in (select woeid from geo.places(1) where text%3D\"nome%2C ak\")";
        return YahooWeather.getInstance().getBookingService().getWeatherData(query, "json", "store%3A%2F%2Fdatatables.org%2Falltableswithkeys");
    }
}