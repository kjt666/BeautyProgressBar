package com.wowo.kjt.beautyprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wowo.kjt.library.BeautyProgressBar;
import com.wowo.kjt.library.IOSProgressBar;
import com.wowo.kjt.library.NumberProgressBar;
import com.wowo.kjt.library.RoundNumberProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private NumberProgressBar progressBar1, progressBar2, progressBar3;
    private RoundNumberProgressBar progressBar4, progressBar5;
    private IOSProgressBar progressBar6;
    private BeautyProgressBar progressBar7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar1 = (NumberProgressBar) findViewById(R.id.progressbar1);
        progressBar2 = (NumberProgressBar) findViewById(R.id.progressbar2);
        progressBar3 = (NumberProgressBar) findViewById(R.id.progressbar3);
        progressBar4 = (RoundNumberProgressBar) findViewById(R.id.progressbar4);
        progressBar5 = (RoundNumberProgressBar) findViewById(R.id.progressbar5);
        progressBar6 = (IOSProgressBar) findViewById(R.id.progressbar6);
        progressBar7 = (BeautyProgressBar) findViewById(R.id.progressbar7);
        new Timer().schedule(new TimerTask() {
            int i = 0;

            @Override
            public void run() {
                progressBar1.setProgress(++i);
            }
        }, 0, 150);
        new Timer().schedule(new TimerTask() {
            int i = 0;

            @Override
            public void run() {
                progressBar2.setProgress(++i);
            }
        }, 100, 180);
        new Timer().schedule(new TimerTask() {
            int i = 0;

            @Override
            public void run() {
                progressBar3.setProgress(++i);
            }
        }, 0, 200);
        new Timer().schedule(new TimerTask() {
            int i = 0;

            @Override
            public void run() {
                progressBar4.setProgress(++i);
            }
        }, 0, 150);
        new Timer().schedule(new TimerTask() {
            int i = 0;

            @Override
            public void run() {
                progressBar5.setProgress(++i);
            }
        }, 0, 200);
        new Timer().schedule(new TimerTask() {
            int i = 0;

            @Override
            public void run() {
                progressBar6.setProgress(++i);
            }
        }, 0, 200);
        new Timer().schedule(new TimerTask() {
            int i = 0;

            @Override
            public void run() {
                progressBar7.setProgress(++i);
            }
        },0,150);
    }
}
