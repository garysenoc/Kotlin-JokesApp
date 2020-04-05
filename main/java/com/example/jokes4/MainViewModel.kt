package com.example.jokes4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){

    val jokesState = MutableLiveData<JokesState>()

    val jokesRepository = JokesRepository()


    init {
        viewModelScope.launch (CoroutineExceptionHandler{ coroutineContext, throwable ->
                jokesState.value = JokesState.Error(throwable)
        }){
            jokesState.value = JokesState.Loading
            jokesState.value = JokesState.Complete(jokesRepository.getRandomJokes())
        }
    }
}