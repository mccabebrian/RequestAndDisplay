package com.brianmccabe.requestanddisplay.model;

import android.os.Parcel;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by brianmccabe on 13/09/2018.
 */

public class Car implements Serializable {
  private VehAvails vehAvails;
  private Vendor vendor;

  public Car(VehAvails vehAvails, Vendor vendor) {
    this.vehAvails = vehAvails;
    this.vendor = vendor;
  }

  protected Car(Parcel in) {
      this.vehAvails= (VehAvails) in.readSerializable();
      this.vendor= (Vendor) in.readSerializable();
  }


  public VehAvails getVehAvails() {
    return vehAvails;
  }

  public void setVehAvails(VehAvails vehAvails) {
    this.vehAvails = vehAvails;
  }

  public Vendor getVendor() {
    return vendor;
  }

  public void setVendor(Vendor vendor) {
    this.vendor = vendor;
  }

  public static Comparator<Car> carPriceComparator = new Comparator<Car>() {

    public int compare(Car c1, Car c2) {
      double CarPrice1 = Double.parseDouble(c1.getVehAvails().getTotalCharge().estimatedTotalAmount);
      double CarPrice2 = Double.parseDouble(c2.getVehAvails().getTotalCharge().estimatedTotalAmount);

      return Double.compare(CarPrice1,CarPrice2);
    }};

}
