package com.adfin.www.linearlayout;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// Implement onClick listener karena terdapat banyak Button pada satu activity
public class MainActivity extends AppCompatActivity implements View.OnClickListener, DialogInterface.OnClickListener{

//    Lebih baik dibuat satu-satu untuk definisi refrencenya biarpun Objectnya sama
    private Button alert1, alert2, btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = (Button)findViewById(R.id.btnToast);
        //cara meliterasi onClick listener ke dalam 1 method OnClick
        btnToast.setOnClickListener(this);

        alert1 = (Button)findViewById(R.id.btnAler1);
        //cara meliterasi onClick listener ke dalam 1 method OnClick
        alert1.setOnClickListener(this);

        alert2 = (Button)findViewById(R.id.btnAler2);
        //cara meliterasi onClick listener ke dalam 1 method OnClick
        alert2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Menggunakan switch case break untuk mengatasi button yang ada sehingga tidak terjadi kesalahan definisi
        //dan membuat lebih simple coding akan lebih readable
        switch (v.getId()){
            case R.id.btnToast:
                Toast.makeText(getApplicationContext(), "Ini Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnAler1:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Ini Judul");
                builder.setMessage("Ini Pesan");
                builder.setNeutralButton("Close", this).show();
                break;
            case R.id.btnAler2:
                AlertDialog.Builder alert2 = new AlertDialog.Builder(this);
                alert2.setTitle("Warning");
                alert2.setMessage("are you sure?");
                alert2.setPositiveButton("Yes", this);
                alert2.setNegativeButton("No", this);
                alert2.setNeutralButton("Cancel", this);
                alert2.show();
                break;
            default:
                break;
        }
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        Log.d("INI dialog", String.valueOf(which));
        switch (which){
            case -3:
                dialog.dismiss();
                break;
            case -2:
                dialog.dismiss();
                break;
            case -1:
                Log.d("ALERT", "INI TOMBOL YES");
                break;
            default:
                break;
        }
    }
}
