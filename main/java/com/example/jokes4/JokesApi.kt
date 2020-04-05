package com.example.jokes4

import retrofit2.http.GET

interface JokesApi {
    @GET("random_ten")
    suspend fun getRandomJokes(): List<Joke>
}