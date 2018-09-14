package com.brianmccabe.requestanddisplay.data;

/**
 * Created by brianmccabe on 13/09/2018.
 */

public interface CarsRequestGateway {
  void loadCars(CarsRequestGatewayCallback.onGetCars cars);
}
