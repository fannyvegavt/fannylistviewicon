package com.example.fannylistviewicon.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fannylistviewicon.R
import com.example.fannylistviewicon.model.Coded

class adaptercode(private val listofcode: ArrayList<Coded>) : RecyclerView.Adapter<adaptercode.CodeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CodeViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.activitycode, parent, false)
        return CodeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listofcode.size
    }

    override fun onBindViewHolder(holder: CodeViewHolder, position: Int) {
        val cd = listofcode[position]
        holder.vName.text = cd.name
        holder.vDetail.text = cd.detail
        Glide.with(holder.itemView.context)
            .load(cd.logo)
            .into(holder.logocode)
    }

    inner class CodeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var vName: TextView = itemView.findViewById(R.id.itemcode)
        var vDetail: TextView = itemView.findViewById(R.id.itemdetail)
        var logocode: ImageView = itemView.findViewById(R.id.logocode)
    }
}