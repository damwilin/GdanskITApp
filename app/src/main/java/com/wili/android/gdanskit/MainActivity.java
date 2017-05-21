package com.wili.android.gdanskit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //Find the View that shows Companies category
        RelativeLayout companies = (RelativeLayout) findViewById(R.id.companies);
        //Set OnClickListener on that view
        companies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CompaniesActivity.class));
            }
        });
        //Find the View that shows Events category
        RelativeLayout events = (RelativeLayout) findViewById(R.id.events);
        //Set OnClickListener on that view
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EventsActivity.class));
            }
        });
        //Find the View that shows coworking category
        RelativeLayout coworking = (RelativeLayout) findViewById(R.id.coworking);
        //Set OnClickListener on that view
        coworking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CoworkingActivity.class));
            }
        });
        //Find the View that shows freetime
        RelativeLayout academies = (RelativeLayout) findViewById(R.id.academies);
        //Set OnClickListener on that view
        academies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AcademiesActivity.class));
            }
        });

    }
}
