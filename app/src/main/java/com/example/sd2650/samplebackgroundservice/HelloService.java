package com.example.sd2650.samplebackgroundservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class HelloService extends Service {

    private static final String TAG = "HelloService";

    private boolean isRunning  = false;

    @Override
    public void onCreate() {
        //TODO: Create a logcat messaage that logs when the service is created

        //TODO: Change the isRunning Boolean to true to indicate the service is now running
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.i(TAG, "Service onStartCommand");

        //Creating new thread for my service
        //Always write your long running tasks in a separate thread, to avoid ANR
        new Thread(new Runnable() {
            @Override
            public void run() {

                //TODO:  Create a while loop that will print a message to the logcat every second to indicate the service is runnin
                //Your logic that service will perform will be placed here
                //In this example we are just looping and waits for 1 second in each loop.

                //TODO: Stop the service when the loop finishes with the stopSelf method
                //Stop service once it finishes its task
                stopSelf();
            }
        }).start();

        return Service.START_STICKY;
    }


    @Override
    public IBinder onBind(Intent arg0) {
        Log.i(TAG, "Service onBind");
        return null;
    }

    @Override
    public void onDestroy() {
        //TODO: Change the isRunning Boolean to false to indicate the service is done
        Log.i(TAG, "Service onDestroy");
    }
}