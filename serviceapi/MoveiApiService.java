package com.example.themovieapp.serviceapi;

import com.example.themovieapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//3
public interface MoveiApiService {

    //The service interface defines the structure
    // and the behavious of the API requests
    // Acts as a bridge between your App and the API

    //retrofit uses Call class to represent
    //network requests and its response
    // and it should be in the Model class which holds
    // all the parameters i.e Result class

    //end point here
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
