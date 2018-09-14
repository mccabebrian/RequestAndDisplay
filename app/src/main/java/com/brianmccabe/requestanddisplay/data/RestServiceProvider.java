package com.brianmccabe.requestanddisplay.data;

import com.brianmccabe.requestanddisplay.BuildConfig;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by brian on 06/05/2017.
 */

public abstract class RestServiceProvider {

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    public static Retrofit.Builder builder =
         new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    public static <S> S createService(
            Class<S> serviceClass) {

        return retrofit.create(serviceClass);
    }

}
