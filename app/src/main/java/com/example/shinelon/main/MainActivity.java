package com.example.shinelon.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(){
            @Override
            public void run() {
                super.run();
                Toast.makeText(MainActivity.this, "111111", Toast.LENGTH_SHORT).show();
            }
        }.start();
        }
        }
