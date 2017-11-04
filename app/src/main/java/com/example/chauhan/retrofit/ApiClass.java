package com.example.chauhan.retrofit;

import android.telecom.Call;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

public interface ApiClass {
    @FormUrlEncoded
    @POST("/select2.php")
    public void InsertUser(@Field("Name") String Name,
                           @Field("Class") String Class,
                           @Field("Phone_No") String Phone_No,
                           Callback<Example> responseCallback);

}


