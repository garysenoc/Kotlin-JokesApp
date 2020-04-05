package com.example.jokes4

sealed class JokesState{
    object Loading : JokesState()
    class Complete(val data: List<Joke>) : JokesState()
    class Error(val throwable: Throwable) : JokesState()

}