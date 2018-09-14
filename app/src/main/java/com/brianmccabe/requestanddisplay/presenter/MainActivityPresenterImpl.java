package com.brianmccabe.requestanddisplay.presenter;

import com.brianmccabe.requestanddisplay.data.CarsRequestGatewayCallback;
import com.brianmccabe.requestanddisplay.data.CarsRestGateway;
import com.brianmccabe.requestanddisplay.data.cache.FileStorage;
import com.brianmccabe.requestanddisplay.model.Cars;
import com.brianmccabe.requestanddisplay.ui.activity.MainActivity;
import com.brianmccabe.requestanddisplay.ui.activity.MainActivityView;


/**
 * Created by brianmccabe on 12/09/2018.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {
  public static final String SORT_BY_DEFAULT = "price";
  MainActivityView mainActivityView;
  FileStorage fileStorage;


  @Override
  public void init(MainActivity mainActivity) {
    this.mainActivityView = mainActivity;
    this.fileStorage = new FileStorage(mainActivity);
  }

  @Override
  public void requestCars() {
    CarsRestGateway carsRestGateway = new CarsRestGateway();

    carsRestGateway.loadCars(new CarsRequestGatewayCallback.onGetCars() {
      @Override
      public void onSuccess(Cars cars) {
        mainActivityView.setInfoDetails(cars.getVehAvailRSCore().getVehRentalCore());
        mainActivityView.setListOFCars(cars.getVehAvailRSCore().getVehVendorAvails(), SORT_BY_DEFAULT);
        fileStorage.StoreFile(cars);
      }

      @Override
      public void onError() {
      }
    });
  }

  @Override
  public void sortBy(String value) {
    Cars cachedCar = fileStorage.retrieveLatest();
    if (cachedCar != null) {
      mainActivityView.setListOFCars(cachedCar.getVehAvailRSCore().getVehVendorAvails(), value);
    }
  }
}
