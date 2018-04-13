package com.belive24hrs.belive24hrs.utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.belive24hrs.belive24hrs.Dashboard.Dashboard;
import com.belive24hrs.belive24hrs.login.dto.LoginResponse;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by Akash on 4/12/2018.
 */

public enum UtilMethods {

    INSTANCE;

    public void Login(final Context context, final String email, final String password){
        EndPointEnterface git = ApiClient.getClient().create(EndPointEnterface.class);
        Call<LoginResponse> call = git.Login(email, password);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, retrofit2.Response<LoginResponse> response) {
                Log.e("Login",new Gson().toJson(response.body()).toString());

                if (response.body()!=null && response.body().getResponse().getStatus().equalsIgnoreCase("1")){
                    Intent i = new Intent(context, Dashboard.class);
                    i.putExtra("Name", response.body().getResponse().getFirstName()+" "+response.body().getResponse().getLastName());
                    context.startActivity(i);
                }else {
                    ///LOgin failed
                }

            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });
    }

    public void SignUp(final Context context, final String firstName,final String lastName,final String email,final String number,final String role, final String password){
        EndPointEnterface git = ApiClient.getClient().create(EndPointEnterface.class);
        Call<LoginResponse> call = git.Register(firstName, lastName, email, number,password,role);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, retrofit2.Response<LoginResponse> response) {
                Log.e("Login",new Gson().toJson(response.body()).toString());

                if (response.body()!=null && response.body().getResponse().getStatus().equalsIgnoreCase("1")){
                    Intent i = new Intent(context, Dashboard.class);
                    i.putExtra("Name", response.body().getResponse().getFirstName()+" "+response.body().getResponse().getLastName());
                    context.startActivity(i);
                }else {
                    ///LOgin failed
                }

            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });
    }
}
