package com.example.anirudh.moviedatabase.rest;

import com.example.anirudh.moviedatabase.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by aniru on 02-02-2018.
 */

public interface MovieApiService {
    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);
}
