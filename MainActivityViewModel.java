package com.example.themovieapp.viewmodel;

import android.app.Application;

import com.example.themovieapp.model.Movie;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.example.themovieapp.model.MovieRepository;

import java.util.List;

//6
public class MainActivityViewModel extends AndroidViewModel {
    // ViewModel: suitable for non-android-specific logic (preserving data on screen rotations etc)
    // AndroidViewModel: used when viewModel class needs to access Android-specific components
    // i.e resources, accessing to database and methods which require context

    private MovieRepository repository;

    // thats the purpose of using AndroidViewModel so we can access context (Application)
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.repository = new MovieRepository(application);
    }

    //LiveData
    public LiveData<List<Movie>> getAllMovies(){
        return repository.getMutableLiveData();

    }
}
