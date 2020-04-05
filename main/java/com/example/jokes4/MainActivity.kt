package com.example.jokes4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    private  val jokesAdapter = JokesListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this ).get(MainViewModel::class.java)

        recJokes.adapter = jokesAdapter

        viewModel.jokesState.observe(this, Observer{
            prgJokes.visibility = if (it == JokesState.Loading) View.VISIBLE else View.GONE
            recJokes.visibility = if(it is JokesState.Complete) View.VISIBLE else View.INVISIBLE
            errJokes.visibility = if(it is JokesState.Error) View.VISIBLE else View.GONE
            when(it) {
                is JokesState.Complete -> {
                    jokesAdapter.submitList(it.data)

                }
            }
        })

        }
    }

