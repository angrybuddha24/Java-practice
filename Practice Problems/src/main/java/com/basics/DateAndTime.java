package com.basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DateAndTime {
    public static void main(String[] args) {

        new DateAndTime().dateFormat();
        new DateAndTime().getTimeFromSeconds(86399);

    }

    public void dateFormat() {
        SimpleDateFormat gmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        gmt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("Now: " + gmt.format(System.currentTimeMillis()));

        gmt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));
        System.out.println("Now: " + gmt.format(System.currentTimeMillis()));
    }

    public void getTimeFromSeconds(double input) {
        double hour = input/3600;
        double min = (hour-Math.floor(hour))*60;
        double sec = (min-Math.floor(min))*60;
        System.out.println((int)Math.floor(hour)+":"+(int)Math.floor(min)+":"+(int)Math.floor(sec));
    }
}
