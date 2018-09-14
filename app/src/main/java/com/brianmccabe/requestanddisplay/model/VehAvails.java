package com.brianmccabe.requestanddisplay.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by brianmccabe on 12/09/2018.
 */

public class VehAvails implements Serializable {
  @SerializedName("@Status")
  private String status;
  private Charge TotalCharge;

  private Vehicle Vehicle;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Charge getTotalCharge ()
  {
    return TotalCharge;
  }

  public void setTotalCharge (Charge TotalCharge)
  {
    this.TotalCharge = TotalCharge;
  }

  public Vehicle getVehicle ()
  {
    return Vehicle;
  }

  public void setVehicle (Vehicle Vehicle)
  {
    this.Vehicle = Vehicle;
  }
}
