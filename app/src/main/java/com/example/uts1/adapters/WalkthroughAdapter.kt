package com.example.uts1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uts1.R

class WalkthroughAdapter(private val layouts: List<Int>) : RecyclerView.Adapter<WalkthroughAdapter.WalkthroughViewHolder>() {
    // 12-13
    //10118122
    //Abbuizral Chillihyat
    //IF3-AKB-UL1
    class WalkthroughViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalkthroughViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return WalkthroughViewHolder(view)
    }

    override fun onBindViewHolder(holder: WalkthroughViewHolder, position: Int) {
        // No additional binding needed for static pages
    }

    override fun getItemViewType(position: Int): Int {
        return layouts[position]
    }

    override fun getItemCount(): Int {
        return layouts.size
    }
}
