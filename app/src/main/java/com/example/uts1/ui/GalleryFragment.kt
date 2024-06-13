package com.example.uts1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts1.R
import com.example.uts1.adapters.GalleryAdapter

class GalleryFragment : Fragment() {
    // 12-13
    //10118122
    //Abbuizral Chillihyat
    //IF3-AKB-UL1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)
        val galleryRecyclerView: RecyclerView = view.findViewById(R.id.gallery_recycler_view)

        galleryRecyclerView.layoutManager = GridLayoutManager(context, 2)
        galleryRecyclerView.adapter = GalleryAdapter(getGalleryImages())


        return view
    }

    private fun getGalleryImages(): List<Int> {
        return listOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            // Add more images here
        )
    }
}
