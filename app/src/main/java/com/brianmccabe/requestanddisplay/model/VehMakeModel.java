package com.brianmccabe.requestanddisplay.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by brianmccabe on 13/09/2018.
 */

public class VehMakeModel implements Serializable{
  @SerializedName("@Name")
  public String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
