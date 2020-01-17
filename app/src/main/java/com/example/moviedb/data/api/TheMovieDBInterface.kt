package com.example.moviedb.data.api

import com.example.moviedb.data.vo.MovieDetails
import com.example.moviedb.data.vo.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {

    // https://api.themoviedb.org/3/movie/popular?api_key=80018c132a036a1a1f5bf64a1fd74cb1&page=1
    // https://api.themoviedb.org/3/movie/512200?api_key=80018c132a036a1a1f5bf64a1fd74cb1
    // https://api.themoviedb.org/3/

    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>

}