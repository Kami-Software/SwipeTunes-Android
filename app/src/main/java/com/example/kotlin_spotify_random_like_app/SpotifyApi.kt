package com.example.kotlin_spotify_random_like_app

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SpotifyApi {
    private val BASE_URL = "https://api.spotify.com/v1/"

    private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val service: SpotifyService by lazy { retrofit.create(SpotifyService::class.java) }
}