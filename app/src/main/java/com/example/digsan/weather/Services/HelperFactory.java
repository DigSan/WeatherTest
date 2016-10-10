package com.example.digsan.weather.Services;

import android.content.Context;

/**
 * Created by digsan on 06.10.2016.
 */

public class HelperFactory {
    private static DatabaseHelper databaseHelper;

    public static DatabaseHelper getHelper(){
        return databaseHelper;
    }
    public static void setHelper(Context context){
        databaseHelper = OpenHelperManager.getHelper(context, DatabaseHelper.class);
    }
    public static void releaseHelper(){
        OpenHelperManager.releaseHelper();
        databaseHelper = null;
    }
}
