package com.wili.android.gdanskit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CoworkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list);
        //Add adapter
        ItemAdapter adapter = new ItemAdapter(this, ItemsDatabase.getCoworking());
        //Find the View that show ListView
        ListView listView = (ListView) findViewById(R.id.list_view);
        //Set adapter to that view
        listView.setAdapter(adapter);
    }
}
