package com.brianmccabe.requestanddisplay.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.brianmccabe.requestanddisplay.R;
import com.brianmccabe.requestanddisplay.data.cache.FileStorage;
import com.brianmccabe.requestanddisplay.model.VehRentalCore;
import com.brianmccabe.requestanddisplay.model.VehVendorAvails;
import com.brianmccabe.requestanddisplay.presenter.MainActivityPresenter;
import com.brianmccabe.requestanddisplay.presenter.MainActivityPresenterImpl;
import com.brianmccabe.requestanddisplay.ui.adapter.CarouselPagerAdapter;

public class MainActivity extends AppCompatActivity implements MainActivityView{
  MainActivityPresenter mainActivityPresenter;
  FileStorage fileStorage;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayShowTitleEnabled(false);

    mainActivityPresenter = new MainActivityPresenterImpl();
    mainActivityPresenter.init(this);
    mainActivityPresenter.requestCars();
    fileStorage = new FileStorage(this);
  }

  @Override
  public void setInfoDetails(VehRentalCore vehRentalCore) {
    TextView locationFromText = findViewById(R.id.location_from);
    TextView locationToText = findViewById(R.id.location_to);
    TextView locationFromDate = findViewById(R.id.date_from);
    TextView locationToDate = findViewById(R.id.date_to);


    locationFromDate.setText(vehRentalCore.getPickUpDateTime());
    locationFromText.setText(vehRentalCore.getPickUpLocation().name);
    locationToDate.setText(vehRentalCore.getReturnDateTime());
    locationToText.setText(vehRentalCore.getPickUpLocation().name);
  }

  @Override
  public void setListOFCars(VehVendorAvails[] vehVendorAvails, String sortByValue) {
    CarouselPagerAdapter mSectionsPagerAdapter = new CarouselPagerAdapter(getSupportFragmentManager(), vehVendorAvails, sortByValue);

    ViewPager mViewPager = findViewById(R.id.container);
    mViewPager.setAdapter(mSectionsPagerAdapter);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);

    MenuItem item = menu.findItem(R.id.spinner);
    Spinner spinner = (Spinner) item.getActionView();
    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String selectedItem = adapterView.getItemAtPosition(i).toString();
      }

      @Override
      public void onNothingSelected(AdapterView<?> adapterView) {

      }
    });

    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
      R.array.sort_by_list, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    spinner.setAdapter(adapter);
    return true;
  }
}
