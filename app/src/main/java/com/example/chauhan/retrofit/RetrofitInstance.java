package com.example.chauhan.retrofit;

import retrofit.RestAdapter;

public class RetrofitInstance
{
    public static final String BASE_URL = "http://unmaterial-magazine.000webhostapp.com";
    public static RestAdapter retrofit = null;
    public static RestAdapter getRetrofit() {
        if (retrofit==null) {
            retrofit = new RestAdapter.Builder()
                    .setEndpoint(BASE_URL)
                    .build();
        }
        return retrofit;
    }
}
