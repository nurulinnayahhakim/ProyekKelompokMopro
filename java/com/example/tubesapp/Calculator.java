package com.example.tubesapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class Calculator extends AppCompatActivity {
    private EditText b_bodyscrub, j_bodyscrub, b_bodylotion, j_bodylotion, b_showerscrub,
            j_showerscrub, b_serumacne, j_serumacne, b_daycreama, j_daycreama, b_nightcreama,
            j_nightcreama, b_facewasha, j_facewasha, b_serumbright, j_serumbright, b_daycreamb,
            j_daycreamb, b_nightcreamb,
            j_nightcreamb, b_facewashb, j_facewashb, htgtotal;
    private Button bttnhitung;
    private Button bttnhapus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        b_bodyscrub = (EditText) findViewById(R.id.bbodyscrub);
        j_bodyscrub = (EditText) findViewById(R.id.jbodyscrub);
        b_bodylotion = (EditText) findViewById(R.id.bbodylotion);
        j_bodylotion = (EditText) findViewById(R.id.jbodylotion);
        b_showerscrub = (EditText) findViewById(R.id.bshowerscrub);
        j_showerscrub = (EditText) findViewById(R.id.jshowerscrub);
        b_serumacne = (EditText) findViewById(R.id.bserumacne);
        j_serumacne = (EditText) findViewById(R.id.jserumacne);
        b_daycreama = (EditText) findViewById(R.id.bdaycreama);
        j_daycreama = (EditText) findViewById(R.id.jdaycreama);
        b_nightcreama = (EditText) findViewById(R.id.bnightcreama);
        j_nightcreama = (EditText) findViewById(R.id.jnightcreama);
        b_facewasha = (EditText) findViewById(R.id.bfacewasha);
        j_facewasha = (EditText) findViewById(R.id.jfacewasha);
        b_serumbright = (EditText) findViewById(R.id.bserumbright);
        j_serumbright = (EditText) findViewById(R.id.jserumbright);
        b_daycreamb = (EditText) findViewById(R.id.bdaycreamb);
        j_daycreamb = (EditText) findViewById(R.id.jdaycreamb);
        b_nightcreamb = (EditText) findViewById(R.id.bnightcreamb);
        j_nightcreamb = (EditText) findViewById(R.id.jnightcreamb);
        b_facewashb = (EditText) findViewById(R.id.bfacewashb);
        j_facewashb = (EditText) findViewById(R.id.jfacewashb);
        htgtotal = (EditText) findViewById(R.id.total);
        bttnhitung = (Button) findViewById(R.id.btnhitung);
        bttnhapus = (Button) findViewById(R.id.btnhapus);

//action button hitung
        bttnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bbodyscrub = b_bodyscrub.getText().toString().trim();
                String jbodyscrub = j_bodyscrub.getText().toString().trim();
                String bbodylotion = b_bodylotion.getText().toString().trim();
                String jbodylotion = j_bodylotion.getText().toString().trim();
                String bshowerscrub = b_showerscrub.getText().toString().trim();
                String jshowerscrub = j_showerscrub.getText().toString().trim();
                String bserumacne = b_serumacne.getText().toString().trim();
                String jserumacne = j_serumacne.getText().toString().trim();
                String bdaycreama = b_daycreama.getText().toString().trim();
                String jdaycreama = j_daycreama.getText().toString().trim();
                String bnightcreama = b_nightcreama.getText().toString().trim();
                String jnightcreama = j_nightcreama.getText().toString().trim();
                String bfacewasha = b_facewasha.getText().toString().trim();
                String jfacewasha = j_facewasha.getText().toString().trim();
                String bserumbright = b_serumbright.getText().toString().trim();
                String jserumbright = j_serumbright.getText().toString().trim();
                String bdaycreamb = b_daycreamb.getText().toString().trim();
                String jdaycreamb = j_daycreamb.getText().toString().trim();
                String bnightcreamb = b_nightcreamb.getText().toString().trim();
                String jnightcreamb = j_nightcreamb.getText().toString().trim();
                String bfacewashb = b_facewashb.getText().toString().trim();
                String jfacewashb = j_facewashb.getText().toString().trim();

                double bbs = Double.parseDouble(bbodyscrub);
                double bbl = Double.parseDouble(bbodylotion);
                double bss = Double.parseDouble(bshowerscrub);
                double bsa = Double.parseDouble(bserumacne);
                double bda = Double.parseDouble(bdaycreama);
                double bna = Double.parseDouble(bnightcreama);
                double bfa = Double.parseDouble(bfacewasha);
                double bsb = Double.parseDouble(bserumbright);
                double bdb = Double.parseDouble(bdaycreamb);
                double bnb = Double.parseDouble(bnightcreamb);
                double bfb = Double.parseDouble(bfacewashb);

                double jbs = (bbs * 51000);
                double jbl = (bbl * 30000);
                double jss = (bss * 30000);
                double jsa = (bsa * 75000);
                double jda = (bda * 55000);
                double jna = (bna * 55000);
                double jfa = (bfa * 65000);
                double jsb = (bsb * 75000);
                double jdb = (bdb * 55000);
                double jnb = (bnb * 55000);
                double jfb = (bfb * 65000);

                j_bodyscrub.setText(""+jbs);
                j_bodylotion.setText(""+jbl);
                j_showerscrub.setText(""+jss);
                j_serumacne.setText(""+jsa);
                j_daycreama.setText(""+jda);
                j_nightcreama.setText(""+jna);
                j_facewasha.setText(""+jfa);
                j_serumbright.setText(""+jsb);
                j_daycreamb.setText(""+jdb);
                j_nightcreamb.setText(""+jnb);
                j_facewashb.setText(""+jfb);
                double total = (jbs + jbl + jss + jsa + jda + jna + jfa +jsb + jdb + jnb + jfb);
                htgtotal.setText(""+total);
            }
        });
        //action button hapus
        bttnhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                b_bodyscrub.setText("");
                j_bodyscrub.setText("");
                b_bodylotion.setText("");
                j_bodylotion.setText("");
                b_showerscrub.setText("");
                j_showerscrub.setText("");
                b_serumacne.setText("");
                j_serumacne.setText("");
                b_daycreama.setText("");
                j_daycreama.setText("");
                b_nightcreama.setText("");
                j_nightcreama.setText("");
                b_facewasha.setText("");
                j_facewasha.setText("");
                b_serumbright.setText("");
                j_serumbright.setText("");
                b_daycreamb.setText("");
                j_daycreamb.setText("");
                b_nightcreamb.setText("");
                j_nightcreamb.setText("");
                b_facewashb.setText("");
                j_facewashb.setText("");
                htgtotal.setText("");
            }
        });
    }
}