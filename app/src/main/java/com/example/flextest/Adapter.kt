package com.example.flextest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.flexbox.FlexboxLayoutManager


class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    private val items = listOf(1, 2, 4, 5, 6, 7, 8, 9, 22, 23, 44, 55)

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val lp = (holder.itemView.layoutParams as FlexboxLayoutManager.LayoutParams)

        lp.flexShrink = 0f
    }
}