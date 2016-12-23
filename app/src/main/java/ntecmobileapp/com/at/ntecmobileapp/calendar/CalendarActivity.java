package ntecmobileapp.com.at.ntecmobileapp.calendar;

import android.app.Dialog;
import android.content.Intent;
import android.net.ParseException;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import ntecmobileapp.com.at.ntecmobileapp.R;

public class CalendarActivity extends AppCompatActivity {
    long startTime,endTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Calendar");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

            }
        });

        //Calendar view initialisation
        CalendarView simpleCalendarView = (CalendarView) findViewById(R.id.calendarView); // get the reference of CalendarView
        simpleCalendarView.setDate(System.currentTimeMillis(),false,true);

        Button sync = (Button)findViewById(R.id.buttonSync);
        assert sync != null;
        Button sync1= (Button)findViewById(R.id.buttonSync1) ;


        sync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               addTerm1start();
            }
        });

        sync1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTerm1end();
            }
        });



    }
    //sync Term 1 start and end dates
    // creates intent with action filter loaded into the native calendar app
    public void addTerm1start(){


        String startDate = "2017-01-05";
        String endDate = "2017-01-06";
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
            startTime=date.getTime();
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
            endTime=date1.getTime();
        }
        catch(Exception e){ }


        //Calendar cal = Calendar.getInstance();
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("beginTime",startTime);
        intent.putExtra("allDay", false);
        intent.putExtra("rrule", "FREQ=YEARLY;");
        intent.putExtra("endTime", endTime);
        intent.putExtra("title", "Term 1 start");
        startActivity(intent);
    }
    public void addTerm1end(){
        String startDate = "2017-04-01";
        String endDate = "2017-04-02";
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
            startTime=date.getTime();
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
            endTime=date1.getTime();
        }
        catch(Exception e){ }


        //Calendar cal = Calendar.getInstance();
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("beginTime",startTime);
        intent.putExtra("allDay", false);
        intent.putExtra("rrule", "FREQ=YEARLY;COUNT=1");
        intent.putExtra("endTime", endTime);
        intent.putExtra("title", "Term 1 end");
        startActivity(intent);
    }

}
