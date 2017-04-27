package com.adfin.www.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ContohSpinner extends AppCompatActivity {

    TextView teksPilih;
    private Spinner sp_negara;
    private String[] list = {"-Pilih-","Indonesia","Amerika", "Malaysia","India", "Singapore","Arab Saudi","Afrika Utara"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        teksPilih = (TextView)findViewById(R.id.txtNegara);
        sp_negara = (Spinner)findViewById(R.id.spNegara);

        sp_negara.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                teksPilih.setText(list[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                teksPilih.setText(" ");
            }
        });


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp_negara.setAdapter(adapter);
    }


}
