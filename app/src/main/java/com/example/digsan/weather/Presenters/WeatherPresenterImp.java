package com.example.digsan.weather.Presenters;

import android.app.Activity;
import android.os.Bundle;

import com.example.digsan.weather.Models.WeatherModel;
import com.example.digsan.weather.Views.WeatherView;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by digsan on 05.10.2016.
 */

public class WeatherPresenterImp implements WeatherPresenter {
    private final WeatherModel model;
    private final WeatherView view;
    private Subscription subscription;

    public WeatherPresenterImp(WeatherModel model, WeatherView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void onCreate(Activity activity, Bundle savedInstanceState) {
        model.gerWeatherData().map(d->d.getQuery().getResults().getChannel().getItem().getForecast())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(f-> view.showWeather(f));
    }
}
