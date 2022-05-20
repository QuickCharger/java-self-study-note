package com.example.emptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static String msg = "EmptyLog";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "onCreate()");
    }

    protected void onResume(){
        super.onResume();
        Log.d(msg, "onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.d(msg, "onPause()");
    }

    protected void onStop() {
        super.onStop();
        Log.d(msg, "onStop()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "onDestroy()");
    }
}