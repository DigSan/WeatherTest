package com.example.digsan.weather.Models;

import rx.Observable;

/**
 * Created by digsan on 05.10.2016.
 */

public interface WeatherModel {
    Observable<String> changeText();
    Observable<String> request(String query);
}
