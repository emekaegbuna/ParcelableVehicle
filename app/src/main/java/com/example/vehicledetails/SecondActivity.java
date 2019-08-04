package com.example.vehicledetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv_make = findViewById(R.id.Tv_make);
        TextView tv_color = findViewById(R.id.Tv_color);
        TextView tv_doors = findViewById(R.id.Tv_doors);

        Vehicle vehicle = getIntent().getParcelableExtra("vehicle");
        tv_make.setText("make: " + vehicle.getMake());
        tv_color.setText("color: " + vehicle.getColor());
        tv_doors.setText("number of doors: " + Integer.toString(vehicle.getDoors()));

    }
}
