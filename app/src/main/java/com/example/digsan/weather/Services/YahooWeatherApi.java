package com.example.digsan.weather.Services;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by digsan on 05.10.2016.
 */

public interface YahooWeatherApi {
    @POST("api/Autorization/Login")
    Observable<String> getWeatherData(@Body int logonRequestData);
}
