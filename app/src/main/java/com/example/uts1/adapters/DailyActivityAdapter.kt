// DailyActivityAdapter.kt
package com.example.uts1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uts1.databinding.ItemDailyActivityBinding
import com.example.uts1.models.DailyActivity

class DailyActivityAdapter(private val dailyActivities: List<DailyActivity>) :
    RecyclerView.Adapter<DailyActivityAdapter.DailyActivityViewHolder>() {
        // 12-13
        //10118122
        //Abbuizral Chillihyat
        //IF3-AKB-UL1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyActivityViewHolder {
        val binding = ItemDailyActivityBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return DailyActivityViewHolder(binding)
    }
    override fun onBindViewHolder(holder: DailyActivityViewHolder, position: Int) {
        val dailyActivity = dailyActivities[position]
        holder.binding.dailyActivityImage.setImageResource(dailyActivity.icon)
        holder.binding.dailyActivityName.text = dailyActivity.title
        holder.binding.dailyActivityTime.text = dailyActivity.time.toString()
        holder.binding.dailyActivityDetails.text = dailyActivity.details
    }

    override fun getItemCount(): Int = dailyActivities.size

    class DailyActivityViewHolder(val binding: ItemDailyActivityBinding) : RecyclerView.ViewHolder(binding.root)
}