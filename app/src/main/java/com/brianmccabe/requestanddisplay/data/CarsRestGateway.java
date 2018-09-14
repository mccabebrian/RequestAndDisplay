package com.brianmccabe.requestanddisplay.data;

import com.brianmccabe.requestanddisplay.model.Cars;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by brianmccabe on 13/09/2018.
 */

public class CarsRestGateway implements CarsRequestGateway {

  private final CarsRequest carsRequest;

  public CarsRestGateway() {
    carsRequest = new CarsRequest();
  }

  @Override
  public void loadCars(final CarsRequestGatewayCallback.onGetCars cb) {
    carsRequest.getCarsResponse(new Callback<ArrayList<Cars>>() {
      @Override
      public void onResponse(Call<ArrayList<Cars>> call, Response<ArrayList<Cars>> response) {
        if(response.isSuccessful()) {
          cb.onSuccess(response.body().get(0));
        } else {
          cb.onError();
        }
      }

      @Override
      public void onFailure(Call<ArrayList<Cars>> call, Throwable t) {
          cb.onError();
      }
    });
  }
}
