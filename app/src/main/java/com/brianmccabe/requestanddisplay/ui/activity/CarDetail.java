package com.brianmccabe.requestanddisplay.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.brianmccabe.requestanddisplay.R;
import com.brianmccabe.requestanddisplay.model.Car;
import com.brianmccabe.requestanddisplay.model.Vehicle;
import com.squareup.picasso.Picasso;

public class CarDetail extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_car_detail);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    Car car = (Car) getIntent().getExtras().getSerializable("Car");


    ImageView imageView = findViewById(R.id.detail_image);
    TextView statusValue = findViewById(R.id.status_value);
    TextView transmissionValue = findViewById(R.id.transmission_value);
    TextView fuelTypeValue = findViewById(R.id.fueltype_value);
    TextView driveTypeValue = findViewById(R.id.driveType_value);
    TextView doorCountValue = findViewById(R.id.doorCount_value);
    TextView vendorValue = findViewById(R.id.vendor_value);

    Vehicle vehicle = car.getVehAvails().getVehicle();
    setTitle(vehicle.getVehMakeModel().getName());
    Picasso.get().load(vehicle.getPictureURL()).into(imageView);
    statusValue.setText(car.getVehAvails().getStatus());
    transmissionValue.setText(vehicle.getTransmissionType());
    fuelTypeValue.setText(vehicle.getFuelType());
    driveTypeValue.setText(vehicle.getDriveType());
    doorCountValue.setText(vehicle.getDoorCount());
    vendorValue.setText(car.getVendor().getName());
  }

}
