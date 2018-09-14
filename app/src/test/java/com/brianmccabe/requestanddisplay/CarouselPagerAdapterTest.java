package com.brianmccabe.requestanddisplay;

import com.brianmccabe.requestanddisplay.model.Car;
import com.brianmccabe.requestanddisplay.model.Charge;
import com.brianmccabe.requestanddisplay.model.VehAvails;
import com.brianmccabe.requestanddisplay.model.VehVendorAvails;
import com.brianmccabe.requestanddisplay.model.Vehicle;
import com.brianmccabe.requestanddisplay.ui.adapter.CarouselPagerAdapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class CarouselPagerAdapterTest {

  private VehAvails vehAvails;
  private VehVendorAvails vehVendorAvails;
  private VehVendorAvails[] vehVendorAvailsArray;

  @Before
  public void init() {
    vehVendorAvails = new VehVendorAvails();
    VehAvails vehAvails = new VehAvails();
    Vehicle vehicle = new Vehicle();
    vehicle.setDoorCount("2");
    vehicle.setPassengerQuantity("5");
    vehAvails.setVehicle(vehicle);
    vehAvails.setStatus("Available");
    Charge charge = new Charge();
    charge.setRateTotalAmount("900");
    vehAvails.setTotalCharge(charge);
    VehAvails[] vehAvailsarray = new VehAvails[1];
    vehAvailsarray[0] = vehAvails;
    vehVendorAvails.setVehAvails(vehAvailsarray);
    vehVendorAvailsArray = new VehVendorAvails[1];
    vehVendorAvailsArray[0] = vehVendorAvails;
  }

  @Test
  public void CarouselPagerAdapter_getAllCars_singleCar() throws Exception {
      ArrayList<Car> cars = CarouselPagerAdapter.getAllCars(vehVendorAvailsArray);

     Assert.assertEquals(cars.size(), 1);
  }

  @Test
  public void CarouselPagerAdapter_getAllCars_twoCars() throws Exception {
    VehVendorAvails[] vehVendorAvailsArrayTwo = new VehVendorAvails[2];
    vehVendorAvailsArrayTwo[0] = vehVendorAvails;
    vehVendorAvailsArrayTwo[1] = vehVendorAvails;

    ArrayList<Car> cars = CarouselPagerAdapter.getAllCars(vehVendorAvailsArrayTwo);

    Assert.assertEquals(cars.size(), 2);
  }
}