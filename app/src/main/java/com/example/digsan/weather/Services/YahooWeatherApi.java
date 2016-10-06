package com.example.digsan.weather.Services;

import com.example.digsan.weather.Models.weather.WeatherResponse;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by digsan on 05.10.2016.
 */

public interface YahooWeatherApi {
    @GET("v1/public/yql")
    Observable<WeatherResponse> getWeatherData(
            @Query("q") String query,
            @Query("format") String format
            );
}
