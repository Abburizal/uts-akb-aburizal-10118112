package com.example.uts1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uts1.R
import com.example.uts1.models.DailyActivity

class DailyActivityAdapter(private val dailyActivities: List<DailyActivity>) :
    RecyclerView.Adapter<DailyActivityAdapter.DailyActivityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyActivityViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_daily_activity, parent, false)
        return DailyActivityViewHolder(view)
    }

    override fun onBindViewHolder(holder: DailyActivityViewHolder, position: Int) {
        val activity = dailyActivities[position]
        holder.imageView.setImageResource(activity.imageResId)
        holder.descriptionView.text = activity.description
    }

    override fun getItemCount(): Int {
        return dailyActivities.size
    }

    class DailyActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val descriptionView: TextView = itemView.findViewById(R.id.descriptionView)
    }
}
