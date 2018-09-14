package com.brianmccabe.requestanddisplay.model;

import java.io.Serializable;

/**
 * Created by brianmccabe on 12/09/2018.
 */

public class VehAvailRSCore implements Serializable {
  private VehRentalCore VehRentalCore;

  private VehVendorAvails[] VehVendorAvails;

  public VehRentalCore getVehRentalCore ()
  {
    return VehRentalCore;
  }

  public void setVehRentalCore (VehRentalCore VehRentalCore)
  {
    this.VehRentalCore = VehRentalCore;
  }

  public VehVendorAvails[] getVehVendorAvails ()
  {
    return VehVendorAvails;
  }

  public void setVehVendorAvails (VehVendorAvails[] VehVendorAvails)
  {
    this.VehVendorAvails = VehVendorAvails;
  }
}
