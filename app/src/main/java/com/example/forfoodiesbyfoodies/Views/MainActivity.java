package com.example.forfoodiesbyfoodies.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.forfoodiesbyfoodies.R;

public class MainActivity extends AppCompatActivity {

    Handler handler;
    Integer time = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler=new Handler();
        // .postDelayed is a function that run after a specific time format  )
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivity(intent); //start intent
                finish();
            }
        }, Long.parseLong(String.valueOf(time)));

    }
}