package com.example.digsan.weather.Views;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by digsan on 05.10.2016.
 */

public class WeatherViewHolder {
    TextView day;
    TextView temp;
    TextView date;
    TextView city;
    TextView text;
    RecyclerView container;

    public WeatherViewHolder(TextView day, TextView temp, TextView date, TextView city, TextView text, RecyclerView container) {
        this.day = day;
        this.temp = temp;
        this.date = date;
        this.container = container;
        this.city = city;
        this.text = text;
    }





}
