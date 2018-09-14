package com.brianmccabe.requestanddisplay.model;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by brianmccabe on 13/09/2018.
 */

public class Vendor implements Serializable {
  @SerializedName("@Code")
  public String code;
  @SerializedName("@Name")
  public String name;

  protected Vendor(Parcel in) {
    code = in.readString();
    name = in.readString();
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
