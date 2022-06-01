package com.example.list03

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView : View) : RecyclerView.ViewHolder( itemView ) {
    val title = itemView.findViewById<TextView>(R.id.textTitle)
    val tag = itemView.findViewById<TextView>(R.id.tag)
    val desc = itemView.findViewById<TextView>(R.id.desc)
}
