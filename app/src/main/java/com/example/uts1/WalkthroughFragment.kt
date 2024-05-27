package com.example.uts1

// WalkthroughFragment.kt
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class WalkthroughFragment : Fragment() {
    private var page: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        page = arguments?.getInt(ARG_PAGE)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_walkthrough, container, false)
    }

    companion object {
        private const val ARG_PAGE = "page"

        @JvmStatic
        fun newInstance(page: Int) =
            WalkthroughFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PAGE, page)
                }
            }
    }
}
