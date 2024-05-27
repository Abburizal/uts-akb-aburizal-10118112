package com.example.uts1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class WalkthroughPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3 // Number of pages
    }

    override fun getItem(position: Int): Fragment {
        return WalkthroughFragment.newInstance(position)
    }
}
