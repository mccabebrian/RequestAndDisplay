package com.brianmccabe.requestanddisplay.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by brianmccabe on 12/09/2018.
 */

public class VehRentalCore implements Serializable {

  @SerializedName("PickUpLocation")
  private Location pickUpLocation;
  @SerializedName("ReturnLocation")
  private Location returnLocation;
  @SerializedName("@PickUpDateTime")
  private String PickUpDateTime;
  @SerializedName("@ReturnDateTime")
  private String ReturnDateTime;

  public Location getPickUpLocation() {
    return pickUpLocation;
  }

  public void setPickUpLocation(Location pickUpLocation) {
    this.pickUpLocation = pickUpLocation;
  }

  public Location getReturnLocation() {
    return returnLocation;
  }

  public void setReturnLocation(Location returnLocation) {
    this.returnLocation = returnLocation;
  }

  public String getPickUpDateTime() {
    return PickUpDateTime;
  }

  public void setPickUpDateTime(String pickUpDateTime) {
    PickUpDateTime = pickUpDateTime;
  }

  public String getReturnDateTime() {
    return ReturnDateTime;
  }

  public void setReturnDateTime(String returnDateTime) {
    ReturnDateTime = returnDateTime;
  }
}
