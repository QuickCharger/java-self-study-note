package com.example.emptyservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MyService extends Service {
    public Timer timer = new Timer();

    public IBinder onBind(Intent arg) {
        return null;
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service start", Toast.LENGTH_LONG).show();
        TimerTask timerTask = new TimerTask() {
            public void run() {
                Log.d("TimerTask", "run()");
            }
        };
        timer.schedule(timerTask, 0, 1000);
        return START_STICKY;
    }

    public void onDestroy() {
        Toast.makeText(this, "service stop", Toast.LENGTH_LONG).show();
        super.onDestroy();
        timer.cancel();
    }
}