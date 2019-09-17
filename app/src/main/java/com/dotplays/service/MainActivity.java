package com.dotplays.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // khai bao intent de start servicce
        intent = new Intent(MainActivity.this,MyService.class);
    }
    // khai bao bien toan cuc intent
    public Intent intent;

    public void startService(View view) {

        // chay service
        startService(intent);

    }

    public void stopService(View view) {

        // dung service
        stopService(intent);
    }
}
