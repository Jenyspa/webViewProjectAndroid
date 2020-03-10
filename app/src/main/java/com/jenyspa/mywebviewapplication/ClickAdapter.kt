package com.jenyspa.mywebviewapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClickAdapter(
    private val companies: List<Company>
) : RecyclerView.Adapter<ClickViewHolder>() {

    override fun getItemCount(): Int {
        return companies.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClickViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_clicks, null, false)
        return ClickViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClickViewHolder, position: Int) {
        holder.bind(companies[position])
    }
}

class ClickViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(company: Company) {
        val sharedPreferences = itemView.context.getSharedPreferences("statistics", Context.MODE_PRIVATE)

        (itemView as TextView).text = "${company.name} ${company.getClicks(sharedPreferences)} cliques."
    }
}