package com.example.sd2650.samplebackgroundservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class HelloActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //starting service
        findViewById(R.id.start_service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Create a new Intent object and call out hte HelloActivity and HelloService class
                //TODO: Start a background service and pass the intent you created

            }
        });


        //service onDestroy callback method will be called
        findViewById(R.id.stop_Service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Create a new Intent object and call out hte HelloActivity and HelloService class
                //TODO: Stop the background service and pass the intent you created

            }
        });

    }
}
