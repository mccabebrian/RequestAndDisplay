package com.brianmccabe.requestanddisplay.model;

import java.io.Serializable;

/**
 * Created by brianmccabe on 12/09/2018.
 */

public class VehVendorAvails implements Serializable {
  private VehAvails[] VehAvails;

  private Vendor Vendor;

  public VehAvails[] getVehAvails ()
  {
    return VehAvails;
  }

  public void setVehAvails (VehAvails[] VehAvails)
  {
    this.VehAvails = VehAvails;
  }

  public Vendor getVendor ()
  {
    return Vendor;
  }

  public void setVendor (Vendor Vendor)
  {
    this.Vendor = Vendor;
  }
}
