// FriendsAdapter.kt
package com.example.uts1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uts1.databinding.ItemFriendBinding
import com.example.uts1.models.Friend

class FriendsAdapter(private val friends: List<Friend>) :
    RecyclerView.Adapter<FriendsAdapter.FriendViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val binding = ItemFriendBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return FriendViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        val friend = friends[position]
        holder.binding.friendImage.setImageResource(friend.imageResId)
        holder.binding.friendName.text = friend.name
    }

    override fun getItemCount() = friends.size

    class FriendViewHolder(val binding: ItemFriendBinding) :
        RecyclerView.ViewHolder(binding.root)
}
