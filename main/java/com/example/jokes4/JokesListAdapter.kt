package com.example.jokes4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_show.view.*

class JokesListAdapter : ListAdapter<Joke, RecyclerView.ViewHolder>(object : DiffUtil.ItemCallback<Joke>() {

    override fun areItemsTheSame(oldItem: Joke, newItem: Joke): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Joke, newItem: Joke): Boolean {
        return oldItem == newItem
    }
}){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_show,parent,false)
        return object : RecyclerView.ViewHolder(view){}
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
      val joke : Joke = getItem(position)

        holder.itemView.txtSetup.text = joke.setup
        holder.itemView.txtPunchline.text = joke.punchline
        holder.itemView.crdJoke.setOnClickListener {
            holder.itemView.txtPunchline.visibility = View.VISIBLE
        }
    }
}