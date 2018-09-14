package com.brianmccabe.requestanddisplay.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.brianmccabe.requestanddisplay.R;
import com.brianmccabe.requestanddisplay.model.Car;
import com.brianmccabe.requestanddisplay.model.Charge;
import com.brianmccabe.requestanddisplay.model.Vehicle;
import com.brianmccabe.requestanddisplay.ui.activity.CarDetail;
import com.squareup.picasso.Picasso;


public class CarouselFragment extends Fragment {
private static final String CAR = "car";

  public CarouselFragment() {
  }

  public static CarouselFragment newInstance(Car car) {
    CarouselFragment fragment = new CarouselFragment();
    Bundle args = new Bundle();
    args.putSerializable(CAR, car);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_main, container, false);
    final Car car = (Car) getArguments().getSerializable(CAR);


    ConstraintLayout constraintLayout = rootView.findViewById(R.id.constraintLayout);
    constraintLayout.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), CarDetail.class);
        intent.putExtra("Car", car);
        startActivity(intent);
      }
    });
    TextView carTitle = rootView.findViewById(R.id.car_title);
    ImageView vehicleImage = (ImageView) rootView.findViewById(R.id.car_image);
    TextView currencyText = (TextView) rootView.findViewById(R.id.price_currency);
    TextView priceText = (TextView) rootView.findViewById(R.id.price_value);
    TextView passengerNumberText = (TextView) rootView.findViewById(R.id.passenger_number);
    TextView luggageNumberText = (TextView) rootView.findViewById(R.id.luggage_number);

    Vehicle vehicle = car.getVehAvails().getVehicle();
    Picasso.get().load(vehicle.getPictureURL()).into(vehicleImage);
    Charge totalCharge = car.getVehAvails().getTotalCharge();
    carTitle.setText(vehicle.getVehMakeModel().getName());
    currencyText.setText(totalCharge.CurrencyCode);
    priceText.setText(totalCharge.estimatedTotalAmount);
    passengerNumberText.setText(vehicle.getPassengerQuantity());
    luggageNumberText.setText(vehicle.getBaggageQuantity());

    return rootView;
  }


}
