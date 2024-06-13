package com.example.uts1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts1.R
import com.example.uts1.adapters.MusicAdapter
import com.example.uts1.models.Music

class MusicFragment : Fragment() {
    // 12-13
    //10118122
    //Abbuizral Chillihyat
    //IF3-AKB-UL1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_music, container, false)
        val musicRecyclerView: RecyclerView = view.findViewById(R.id.music_recycler_view)

        musicRecyclerView.layoutManager = LinearLayoutManager(context)
        musicRecyclerView.adapter = MusicAdapter(getMusicList())

        return view
    }

    private fun getMusicList(): List<Music> {
        return listOf(
            Music("Song 1", "Artist 1"),
            Music("Song 2", "Artist 2"),
            Music("Song 3", "Artist 3")
            // Add more songs here
        )
    }
}
