package com.adfin.www.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersegiPanjang extends AppCompatActivity {

    EditText Panjang, Lebar, Luas;
    Button HitungLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        Panjang = (EditText)findViewById(R.id.edtPanjang);
        Lebar = (EditText)findViewById(R.id.edtLebar);
        Luas = (EditText)findViewById(R.id.edtLuas);
        HitungLuas = (Button) findViewById(R.id.btnHitung);

        HitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int panjang = Integer.parseInt(Panjang.getText().toString());
                int lebar = Integer.parseInt(Lebar.getText().toString());
                int luas = panjang * lebar;
                Luas.setText(panjang +" x " + lebar + " = " + luas );
            }
        });
    }
}
