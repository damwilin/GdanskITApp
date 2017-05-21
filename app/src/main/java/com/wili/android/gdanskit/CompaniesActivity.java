package com.wili.android.gdanskit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CompaniesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companies);
        //Add adapter
        ItemAdapter adapter = new ItemAdapter(this, ItemsDatabase.getCompanies());
        //Find the View that shows ListView
        ListView listView = (ListView) findViewById(R.id.list_view);
        //Set adapter on this view
        listView.setAdapter(adapter);

    }
}
