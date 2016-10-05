package com.example.digsan.weather.Services;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by digsan on 05.10.2016.
 */
public class YahooWeather {
    String host = "http://pobeda-api.azurewebsites.net";

    public final YahooWeatherApi bookingService = new Retrofit.Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(host)
    .build().create(YahooWeatherApi.class);

    private static YahooWeather ourInstance = new YahooWeather();

    public static YahooWeather getInstance() {
        return ourInstance;
    }

    private YahooWeather() {
    }
}
