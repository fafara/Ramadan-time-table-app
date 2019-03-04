package com.example.sawood.cardvie;

import android.text.format.Time;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RamdanCountDownTimer {

    private long intervalMillis;

    public RamdanCountDownTimer(int second, int minute, int hour, int monthDay, int month, int year) {

        Time futureTime = new Time();

        // Set date to future time
        futureTime.set(second, minute, hour, monthDay, month, year);
        futureTime.normalize(true);
        long futureMillis = futureTime.toMillis(true);

        Time timeNow = new Time();

        // Set date to current time
        timeNow.setToNow();
        timeNow.normalize(true);
        long nowMillis = timeNow.toMillis(true);

        // Subtract current milliseconds time from future milliseconds time to retrieve interval
        intervalMillis = futureMillis - nowMillis;
    }

    public long getIntervalMillis() {
        return intervalMillis;
    }


}
