package com.example.digsan.weather.Views;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by digsan on 05.10.2016.
 */

public class WeatherViewHolder {
    TextView day;
    RecyclerView.Recycler container;

    public WeatherViewHolder(TextView day, RecyclerView.Recycler container) {
        this.day = day;
        this.container = container;
    }


}
