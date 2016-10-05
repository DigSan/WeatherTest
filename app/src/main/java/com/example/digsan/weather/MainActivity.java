package com.example.digsan.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.digsan.weather.Models.WeatherModel;
import com.example.digsan.weather.Models.WeatherModelImp;
import com.example.digsan.weather.Presenters.WeatherPresenter;
import com.example.digsan.weather.Presenters.WeatherPresenterImp;
import com.example.digsan.weather.Views.WeatherView;
import com.example.digsan.weather.Views.WeatherViewHolder;
import com.example.digsan.weather.Views.WeatherViewImp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView day = (TextView) findViewById(R.id.main_day);
        TextView temperature = (TextView) findViewById(R.id.main_temperature);

        WeatherViewHolder weatherViewHolder = new WeatherViewHolder(day, null);

        WeatherModel model = new WeatherModelImp();

        WeatherView view = new WeatherViewImp(weatherViewHolder);

        WeatherPresenter presenter = new WeatherPresenterImp(model, view);

        presenter.onCreate(this, savedInstanceState);


    }
}
