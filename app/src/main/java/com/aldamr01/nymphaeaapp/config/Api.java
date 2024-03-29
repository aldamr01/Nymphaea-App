package com.aldamr01.nymphaeaapp.config;

import com.aldamr01.nymphaeaapp.home.dashboard.DashboardModel;
import com.aldamr01.nymphaeaapp.login.LoginModel;
import com.aldamr01.nymphaeaapp.login.LoginRequestModel;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.DELETE;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Url;

public interface Api {

    @FormUrlEncoded
    @POST("authenticate")
    Call<LoginModel> login(
        @Field("username") String username,
        @Field("password") String password
    );

    @FormUrlEncoded
    @GET
    Call<DashboardModel> filteredPond(
        @Header("Authorization") String tokenAuthorization,
        @Query("token") String token
    );
}
