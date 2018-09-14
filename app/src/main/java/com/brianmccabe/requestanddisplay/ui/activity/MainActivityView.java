package com.brianmccabe.requestanddisplay.ui.activity;

import com.brianmccabe.requestanddisplay.model.VehRentalCore;
import com.brianmccabe.requestanddisplay.model.VehVendorAvails;

/**
 * Created by brianmccabe on 13/09/2018.
 */

public interface MainActivityView {
  void setInfoDetails(VehRentalCore vehRentalCore);
  void setListOFCars(VehVendorAvails[] vehVendorAvails, String sortByValue);
}
