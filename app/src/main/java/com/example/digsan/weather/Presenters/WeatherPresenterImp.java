package com.example.digsan.weather.Presenters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.digsan.weather.Models.WeatherModel;
import com.example.digsan.weather.Views.WeatherView;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

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
        model.gerWeatherData("Novosibirsk").map(d->d.getQuery().getResults())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(r-> view.showWeather(r)
                        , ex->
                                Toast.makeText(activity, ex.getMessage(), Toast.LENGTH_LONG).show());
    }
}
