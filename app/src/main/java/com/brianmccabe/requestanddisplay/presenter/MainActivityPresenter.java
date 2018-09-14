package com.brianmccabe.requestanddisplay.presenter;

import com.brianmccabe.requestanddisplay.ui.activity.MainActivity;

/**
 * Created by brianmccabe on 12/09/2018.
 */

public interface MainActivityPresenter {
  void init(MainActivity mainActivity);
  void requestCars();
  void sortBy(String value);
}
