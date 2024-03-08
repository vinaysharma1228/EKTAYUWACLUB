package com.rbhagat.ektayuwaclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;

import java.util.Calendar;

public class calendar_page extends AppCompatActivity {
    
    CalendarView calendarView;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_page);
         calendar=Calendar.getInstance();

        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

        calendarView=findViewById(R.id.calenderView);
        calendar.set(currentYear,currentMonth-1,currentDay);

        calendarView.setDate(calendar.getTimeInMillis());



    }




}