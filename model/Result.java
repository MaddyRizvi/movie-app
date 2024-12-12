package com.example.themovieapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


//1
public class Result {


    @SerializedName("page")
    @Expose
    private Integer page;

    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;

    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    @SerializedName("results")
    @Expose
    private List<Movie> results = null;

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public Integer getTotal_results() {
        return totalResults;
    }

    public void setTotal_results(Integer total_results) {
        this.totalResults = total_results;
    }

    public Integer getTotal_pages() {
        return totalPages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.totalPages = total_pages;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    // Empty constructor to prevent possible null pointer exception
    public Result(){

    }
}
