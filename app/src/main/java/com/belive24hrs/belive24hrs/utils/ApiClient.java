package com.belive24hrs.belive24hrs.utils;

import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Akash on 4/12/2018.
 */

public class ApiClient {
    private static Retrofit retrofit = null;

    final static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .writeTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS)
            .build();

    public static Retrofit getClient() {
        if (retrofit == null) {

            ////////////////////////////////////////////////////
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.INSTANCE.Base_URL)
                    .addConverterFactory(GsonConverterFactory.create(new GsonBuilder()
                            .setLenient()
                            .create()))
                    .client(okHttpClient)
                    .build();
        }
        return retrofit;
    }
}
