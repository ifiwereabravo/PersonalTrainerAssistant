package com.bignerranch.android.personaltrainerassistant2;

import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;



public class MakeNewCustomer extends AppCompatActivity {


    public static String ACTION_IMAGE_CAPTURE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_new_customer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //TBD - insert code to collect name and phone number data to pass it to the customer profile page


        Button new_customer_submit_button= (Button) findViewById(R.id.new_customer_submit_button);
        new_customer_submit_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startMakeNewCustomerActivity = new Intent(new Intent(MakeNewCustomer.this, customerProfile.class));
                startActivity(startMakeNewCustomerActivity);
            }
        });

        //TBD - insert code to open camera to take a photo, to collect that photo and pass it to the customer profile page


        FloatingActionButton fab_camera = (FloatingActionButton) findViewById(R.id.fab_camera);
        fab_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}