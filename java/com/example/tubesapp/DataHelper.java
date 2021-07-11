package com.example.tubesapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "akademik.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //TODO Auto-generated method stub
        String sql = "create table daftarbarang (nama text primary key, jumlah integer null, harga integer null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        //insert data dummy
        sql = "INSERT INTO daftarbarang (nama, jumlah, harga) VALUES ('Body Scrub','10','51000');";
        db.execSQL(sql);
        sql = "INSERT INTO daftarbarang (nama, jumlah, harga) VALUES ('Body Lotion','20','30000');";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
    }
}
