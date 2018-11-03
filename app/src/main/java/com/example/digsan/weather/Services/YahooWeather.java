package com.example.digsan.weather.Services;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by digsan on 05.10.2016.
 */
public class YahooWeather {
    String host = "https://query.yahooapis.com/";

    public YahooWeatherApi getBookingService() {
        return bookingService;
    }

    private final YahooWeatherApi bookingService;

    private static YahooWeather ourInstance;

    public static void init(){
        ourInstance = new YahooWeather();
    }

    public static YahooWeather getInstance() {
        return ourInstance;
    }

    private YahooWeather() {
        bookingService =  new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(host)
                .build().create(YahooWeatherApi.class);
    }
}
