package com.example.tubesapp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView container;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.iv_icons);
        container.setBackgroundResource(R.drawable.splash_animation);

        animationDrawable = (AnimationDrawable) container.getBackground();
        int loadingtime = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(MainActivity.this, MainMenu.class);
                startActivity(home);
                finish();
            }
        }, loadingtime);
    }

    @Override
    protected void onResume() {
        super.onResume();

        animationDrawable.start();

        checkAnimationStatus(50, animationDrawable);
    }

    private void checkAnimationStatus(final int time, final AnimationDrawable animationDrawable) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (animationDrawable.getCurrent() != animationDrawable.getFrame(animationDrawable.getNumberOfFrames() - 1))
                    checkAnimationStatus(time, animationDrawable);
                else finish();
            }
        }, time);
    }
}