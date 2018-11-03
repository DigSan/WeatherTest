package com.example.digsan.weather.Presenters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.digsan.weather.Models.WeatherModel;
import com.example.digsan.weather.Views.WeatherView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by digsan on 05.10.2016.
 */

public class WeatherPresenterImp implements WeatherPresenter {
    private final WeatherModel model;
    private final WeatherView view;

    public WeatherPresenterImp(WeatherModel model, WeatherView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void onCreate(Activity activity, Bundle savedInstanceState) {
        model.gerWeatherData("Novosibirsk").map(d->d.getQuery().getResults())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(r-> view.showWeather(r)
                        , ex->
                                Toast.makeText(activity, ex.getMessage(), Toast.LENGTH_LONG).show());
    }
}
