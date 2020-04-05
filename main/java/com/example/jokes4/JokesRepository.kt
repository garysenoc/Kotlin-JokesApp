package com.example.jokes4

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class JokesRepository {
    val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl("https://official-joke-api.appspot.com")
        .build()

    val jokesApi: JokesApi = retrofit.create(JokesApi::class.java)

    suspend fun getRandomJokes():List<Joke> = jokesApi.getRandomJokes()
}