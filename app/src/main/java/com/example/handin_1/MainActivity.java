package com.example.handin_1;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "App up and running");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Pausing the app");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Now resuming the application");
    }
}