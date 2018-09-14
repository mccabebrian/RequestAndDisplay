package com.brianmccabe.requestanddisplay.data;

import com.brianmccabe.requestanddisplay.model.Cars;

/**
 * Created by brianmccabe on 13/09/2018.
 */

public interface CarsRequestGatewayCallback {
  interface onGetCars {
    void onSuccess(Cars cars);
    void onError();
  }
}
