package com.adfin.www.linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContohMultipleActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_multiple);

        btn1 = (Button)findViewById(R.id.btnHlmn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                i = new Intent(getApplicationContext(), Halaman1.class);
                startActivity(i);
            }
        });

        btn2 = (Button)findViewById(R.id.btnHlmn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                i = new Intent(getApplicationContext(), ContohListView.class);
                startActivity(i);
            }
        });

        btn3 = (Button)findViewById(R.id.btnHlmn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                i = new Intent(getApplicationContext(), ContohSpinner.class);
                startActivity(i);
            }
        });

        btn4 = (Button)findViewById(R.id.btnHlmn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = null;
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
