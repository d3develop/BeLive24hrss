package com.belive24hrs.belive24hrs.utils;

import com.belive24hrs.belive24hrs.login.dto.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Akash on 4/12/2018.
 */

public interface EndPointEnterface {

    @FormUrlEncoded
    @POST("/api/v1/register")
    Call<LoginResponse> Register(@Field("firstName") String firstName,
                                 @Field("lastName") String lastName,
                                 @Field("email") String email,
                                 @Field("phone") String phone,
                                 @Field("password") String password,
                                 @Field("role") String role);

    @FormUrlEncoded
    @POST("/api/v1/login")
    Call<LoginResponse> Login(@Field("email") String email,
                              @Field("password") String password);
}
