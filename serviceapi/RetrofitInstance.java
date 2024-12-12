package com.example.themovieapp.serviceapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//4
public class RetrofitInstance {

    //Acts as a central configuration point for
    //definig how HTTP requests and responses
    //should be handled

    private static Retrofit retrofit = null;
    private static String BASE_URL = "https://api.themoviedb.org/3/";

    public static MoveiApiService getService(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(MoveiApiService.class);
    }

}
