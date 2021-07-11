package com.example.tubesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    Button btn_daftar, btn_calc, btn_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btn_daftar = (Button) findViewById(R.id.btndaftar);
        btn_calc = (Button) findViewById(R.id.btncalc);
        btn_info = (Button) findViewById(R.id.btninfo);

        btn_daftar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, DaftarBarang.class);
                startActivity(intent);
            }
        });
        btn_calc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Calculator.class);
                startActivity(intent);
            }
        });
        btn_info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Info.class);
                startActivity(intent);
            }
        });
    }
}