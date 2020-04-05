package com.example.jokes4

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Joke(
    @Json(name="id")
    val id: String,
    @Json(name="setup")
    val setup:String,
    @Json(name="punchline")
    val punchline: String
)