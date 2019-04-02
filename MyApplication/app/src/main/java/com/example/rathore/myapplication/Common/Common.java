package com.example.rathore.myapplication.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static final String APP_ID="6ac98d705d635931b8e3acb9e43cfe26";
    public static Location current_location=null;

    public static String covertUnixToDate(long dt) {
        Date date=new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }
    public static String convertUnixToHour(long dt){
        Date date=new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }
}
