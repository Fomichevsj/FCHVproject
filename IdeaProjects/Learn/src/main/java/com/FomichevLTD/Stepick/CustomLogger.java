package com.FomichevLTD.Stepick;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by safomichev on 30.06.2017.
 */
public class CustomLogger {

    private Calendar calendar;
    private SimpleDateFormat simpleDateFormat;

    public void debug(String str) {
        //Create current time
        simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        calendar = Calendar.getInstance();
        // print in std err
        System.err.println("[ " + simpleDateFormat.format(calendar.getTime()) + " ] " + str);
    }
}
