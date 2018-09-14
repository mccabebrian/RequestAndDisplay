package com.brianmccabe.requestanddisplay.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by brianmccabe on 12/09/2018.
 */

public class Vehicle implements Serializable {
  @SerializedName("@AirConditionInd")
  private String airConditionInd;
  @SerializedName("@TransmissionType")
  private String transmissionType;
  @SerializedName("@FuelType")
  private String fuelType;
  @SerializedName("@DriveType")
  private String driveType;
  @SerializedName("@PassengerQuantity")
  private String passengerQuantity;
  @SerializedName("@BaggageQuantity")
  private String baggageQuantity;
  @SerializedName("@Code")
  private String code;
  @SerializedName("@CodeContext")
  private String codeContext;
  @SerializedName("@DoorCount")
  private String doorCount;
  @SerializedName("PictureURL")
  private String PictureURL;

  private VehMakeModel VehMakeModel;

  public String getPictureURL ()
  {
    return PictureURL;
  }

  public void setPictureURL (String PictureURL)
  {
    this.PictureURL = PictureURL;
  }

  public VehMakeModel getVehMakeModel() {
    return VehMakeModel;
  }

  public void setVehMakeModel(VehMakeModel vehMakeModel) {
    VehMakeModel = vehMakeModel;
  }

  public String getAirConditionInd() {
    return airConditionInd;
  }

  public void setAirConditionInd(String airConditionInd) {
    this.airConditionInd = airConditionInd;
  }

  public String getTransmissionType() {
    return transmissionType;
  }

  public void setTransmissionType(String transmissionType) {
    this.transmissionType = transmissionType;
  }

  public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public String getDriveType() {
    return driveType;
  }

  public void setDriveType(String driveType) {
    this.driveType = driveType;
  }

  public String getPassengerQuantity() {
    return passengerQuantity;
  }

  public void setPassengerQuantity(String passengerQuantity) {
    this.passengerQuantity = passengerQuantity;
  }

  public String getBaggageQuantity() {
    return baggageQuantity;
  }

  public void setBaggageQuantity(String baggageQuantity) {
    this.baggageQuantity = baggageQuantity;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getCodeContext() {
    return codeContext;
  }

  public void setCodeContext(String codeContext) {
    this.codeContext = codeContext;
  }

  public String getDoorCount() {
    return doorCount;
  }

  public void setDoorCount(String doorCount) {
    this.doorCount = doorCount;
  }

}
