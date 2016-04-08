package com.bignerranch.android.personaltrainerassistant2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button make_new_customer_button= (Button) findViewById(R.id.enter_new_customer);
        make_new_customer_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startMakeNewCustomerActivity = new Intent(new Intent(MainActivity.this, MakeNewCustomer.class));
                startActivity(startMakeNewCustomerActivity);
            }
        });

        Button go_to_customer_list_button= (Button) findViewById(R.id.customer_list);
        go_to_customer_list_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startCustomerListActivity = new Intent(new Intent(MainActivity.this, CustomerListActivity.class));
                startActivity(startCustomerListActivity);
            }
        });
    }
}