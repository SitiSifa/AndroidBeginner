package com.adfin.www.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ContohListView extends AppCompatActivity {

    String[] menuItem ={
            "Safari",
            "Camera",
            "Global",
            "UC Browser",
            "Firefox",
            "Cold War"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_list_view);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_list, menuItem);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}
