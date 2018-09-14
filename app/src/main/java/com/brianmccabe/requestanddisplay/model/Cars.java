package com.brianmccabe.requestanddisplay.model;

import java.io.Serializable;

/**
 * Created by brianmccabe on 12/09/2018.
 */

public class Cars implements Serializable{
  private VehAvailRSCore VehAvailRSCore;

  public VehAvailRSCore getVehAvailRSCore ()
  {
    return VehAvailRSCore;
  }

  public void setVehAvailRSCore (VehAvailRSCore VehAvailRSCore)
  {
    this.VehAvailRSCore = VehAvailRSCore;
  }
}
