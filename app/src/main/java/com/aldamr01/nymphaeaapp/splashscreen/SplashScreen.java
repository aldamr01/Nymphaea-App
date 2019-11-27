package com.aldamr01.nymphaeaapp.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.aldamr01.nymphaeaapp.R;
import com.aldamr01.nymphaeaapp.login.LoginActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    private Timer timer;
    private ProgressBar progressBar;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        progressBar = findViewById(R.id.pb_splash_screen_loading);
        progressBar.setProgress(0);

        final long period = 20;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (counter < 100){
                    progressBar.setProgress(counter);
                    counter++;
                }else{
                    timer.cancel();
                    Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 0, period);
    }
}
