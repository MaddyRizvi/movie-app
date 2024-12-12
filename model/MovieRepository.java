package com.example.themovieapp.model;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.themovieapp.R;
import com.example.themovieapp.serviceapi.MoveiApiService;
import com.example.themovieapp.serviceapi.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//5
public class MovieRepository {
    // used to fetch the abstract data resource
    // and provide clean API to the View Model
    // to fetch and Manage the Data

    private ArrayList<Movie> movies = new ArrayList<>();
    // MutableLiveData helps to modify the stored data using set and post
    private MutableLiveData<List<Movie>> mutableLiveData = new MutableLiveData<>();

    //using this to get access to layout file (string.xml) for api value
    private Application application;

    public MovieRepository(Application application){
        this.application = application;
    }

    public MutableLiveData<List<Movie>> getMutableLiveData() {
        MoveiApiService moveiApiService = RetrofitInstance.getService();
        Call<Result> call = moveiApiService.
                getPopularMovies(application.getApplicationContext()
                        .getString(R.string.api_key));

        // asynchronous method
        // perform network request in the background thread and
        // handle the response on the main UI thread
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                // success
                Result result = response.body();

                if(result !=null && result.getResults() != null){
                    movies = (ArrayList<Movie>) result.getResults();
                    mutableLiveData.setValue(movies);

                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable throwable) {

            }
        });
        return mutableLiveData;
    }
}
