package com.example.themovieapp.model;

import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import java.util.List;

import com.bumptech.glide.Glide;
import com.example.themovieapp.BR;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//2
public class Movie extends BaseObservable {


    @SerializedName("id")
    @Expose
    private Integer id;


    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;


    @SerializedName("overview")
    @Expose
    private String overview;

    @SerializedName("poster_path")
    @Expose
    private String posterPath;

    @BindingAdapter({"posterPath"})
    public static void loadImage(ImageView imageView, String imageURL){
    //Basic URL:  "https://image.tmdb.org/t/p/w500/"    w500 is the file size
        String imagePath = "https://image.tmdb.org/t/p/w500/"+imageURL;

        Glide.with(imageView.getContext())
                .load(imagePath)
                .into(imageView);

    }

    @SerializedName("release_date")
    @Expose
    private String releaseDate;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("video")
    @Expose
    private Boolean video;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
        notifyPropertyChanged(BR.voteAverage);   //BR stands for Binding Resources
    }

    @Bindable
    public Double getVoteAverage() {
        return voteAverage;
    }


}