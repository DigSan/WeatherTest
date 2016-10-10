package com.example.digsan.weather.Services;

import android.app.Application;

/**
 * Created by digsan on 06.10.2016.
 */

public class Weather extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        YahooWeather.init();
        HelperFactory.setHelper(getApplicationContext());
    }
    @Override
    public void onTerminate() {
        HelperFactory.releaseHelper();
        super.onTerminate();
    }
}
