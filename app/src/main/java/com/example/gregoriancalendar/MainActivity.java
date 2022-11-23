package com.example.gregoriancalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textid);

       // Calendar cal = Calendar.getInstance();

        /* Creating an object of  GregorianCalendar Class */
        GregorianCalendar gcal = new GregorianCalendar();

        String times= (gcal.get(Calendar.HOUR_OF_DAY)+ ":"
//                + gcal.get(Calendar.MINUTE) + ":"
                + gcal.get(Calendar.SECOND));
        textView.setText("Time :"+times);
//
    }
}