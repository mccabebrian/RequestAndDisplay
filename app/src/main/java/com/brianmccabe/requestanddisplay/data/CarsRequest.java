package com.brianmccabe.requestanddisplay.data;

import com.brianmccabe.requestanddisplay.model.Cars;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by brianmccabe on 13/09/2018.
 */

public class CarsRequest {

    private static final String HEADER_CONTENT_TYPE = "Content-type: text/plain;charset=ISO-8859-1";
    private static final String GET_TICKETS_ENDPOINT = "cars.json";

    public interface CarsRestService {
      @Headers({HEADER_CONTENT_TYPE})
      @GET(GET_TICKETS_ENDPOINT)
      Call<ArrayList<Cars>> getCars();
    }

    private final CarsRestService carsRestService;

    public CarsRequest() {
      carsRestService = RestServiceProvider.createService(CarsRestService.class);
    }

    public void getCarsResponse(Callback<ArrayList<Cars>> callback) {
      Call<ArrayList<Cars>> call = carsRestService.getCars();
      call.enqueue(callback);
    }

}
