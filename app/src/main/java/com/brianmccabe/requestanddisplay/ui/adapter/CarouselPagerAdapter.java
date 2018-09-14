package com.brianmccabe.requestanddisplay.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.brianmccabe.requestanddisplay.model.Car;
import com.brianmccabe.requestanddisplay.model.VehAvails;
import com.brianmccabe.requestanddisplay.model.VehVendorAvails;
import com.brianmccabe.requestanddisplay.ui.fragment.CarouselFragment;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by brianmccabe on 12/09/2018.
 */

public class CarouselPagerAdapter extends FragmentPagerAdapter {
  private static ArrayList<Car> cars;

  public CarouselPagerAdapter(FragmentManager fm, VehVendorAvails[] vehVendorAvails, String sortByValue) {
    super(fm);
    cars = new ArrayList<>();
    getAllCars(vehVendorAvails);
    if (sortByValue.equals("price")) {
      Collections.sort(getAllCars(vehVendorAvails), Car.carPriceComparator);
    }
  }

  public static ArrayList<Car> getAllCars(VehVendorAvails[] vehVendorAvails) {
    cars = new ArrayList<>();
    for (int i=0; i<vehVendorAvails.length; i++) {
      VehVendorAvails currentVehicle = vehVendorAvails[i];
      VehAvails[] vehAvails = currentVehicle.getVehAvails();
      int vehAvailsLength = vehAvails.length;
      for (int j=0; j<vehAvailsLength; j++) {
        cars.add(new Car(vehAvails[j], currentVehicle.getVendor()));
      }
    }
    return cars;
  }

  @Override
  public Fragment getItem(int position) {
    return CarouselFragment.newInstance(cars.get(position));
  }

  @Override
  public int getCount() {
    return cars.size();
  }
}
