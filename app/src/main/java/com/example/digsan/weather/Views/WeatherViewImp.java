package com.example.digsan.weather.Views;

import android.support.v7.widget.LinearLayoutManager;

import com.example.digsan.weather.Models.weather.Condition;
import com.example.digsan.weather.Models.weather.Forecast;
import com.example.digsan.weather.Models.weather.Results;
import com.example.digsan.weather.MyAdapter;

import java.util.List;
import java.util.Observable;

import rx.Observer;


/**
 * Created by digsan on 05.10.2016.
 */

public class WeatherViewImp implements WeatherView {
    private final WeatherViewHolder weatherViewHolder;

    public WeatherViewImp(final WeatherViewHolder viewHolder) {
        this.weatherViewHolder = viewHolder;
    }

    @Override
    public void showWeather(Results weatherForDays) {
        List<Forecast> forecasts = weatherForDays.getChannel().getItem().getForecast();
        Condition condition = weatherForDays.getChannel().getItem().getCondition();
        weatherViewHolder.day.setText(condition.getDate().split(",")[0]);
        weatherViewHolder.temp.setText(condition.getTemp() +"°"+ weatherForDays.getChannel().getUnits().getTemperature());
        weatherViewHolder.city.setText(weatherForDays.getChannel().getLocation().getCity());
        weatherViewHolder.text.setText(condition.getText());

        weatherViewHolder.container.setHasFixedSize(true);
        MyAdapter mAdapter = new MyAdapter(forecasts);
        weatherViewHolder.container.setAdapter(mAdapter);


    }
}
