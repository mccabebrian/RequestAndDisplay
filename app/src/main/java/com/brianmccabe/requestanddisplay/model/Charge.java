package com.brianmccabe.requestanddisplay.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by brianmccabe on 13/09/2018.
 */

public class Charge implements Serializable {
  @SerializedName("@RateTotalAmount")
  public String rateTotalAmount;
  @SerializedName("@EstimatedTotalAmount")
  public String estimatedTotalAmount;
  @SerializedName("@CurrencyCode")
  public String CurrencyCode;

  public String getRateTotalAmount() {
    return rateTotalAmount;
  }

  public void setRateTotalAmount(String rateTotalAmount) {
    this.rateTotalAmount = rateTotalAmount;
  }

  public String getEstimatedTotalAmount() {
    return estimatedTotalAmount;
  }

  public void setEstimatedTotalAmount(String estimatedTotalAmount) {
    this.estimatedTotalAmount = estimatedTotalAmount;
  }

  public String getCurrencyCode() {
    return CurrencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    CurrencyCode = currencyCode;
  }
}
