// DailyActivityFragment.kt
package com.example.uts1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts1.R
import com.example.uts1.adapters.DailyActivityAdapter
import com.example.uts1.adapters.FriendsAdapter
import com.example.uts1.models.DailyActivity
import com.example.uts1.models.Friend

class DailyActivityFragment : Fragment() {
    // 12-13
    //10118122
    //Abbuizral Chillihyat
    //IF3-AKB-UL1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_daily_activity, container, false)
        val dailyRecyclerView: RecyclerView = view.findViewById(R.id.daily_recycler_view)
        val friendsRecyclerView: RecyclerView = view.findViewById(R.id.friends_recycler_view)

        dailyRecyclerView.layoutManager = LinearLayoutManager(context)
        friendsRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        dailyRecyclerView.adapter = DailyActivityAdapter(getDailyActivities())
        friendsRecyclerView.adapter = FriendsAdapter(getFriendsList())

        return view
    }

    private fun getDailyActivities(): List<DailyActivity> {
        return listOf(
            DailyActivity(R.drawable.ic_activity_example, "Go to the gym"),
            DailyActivity(R.drawable.ic_activity_example, "Read a book"),
            DailyActivity(R.drawable.ic_activity_example, "Work on a project")
        )
    }

    private fun DailyActivity(icon: Int, title: String): DailyActivity {

        return TODO("Provide the return value")
    }

    private fun getFriendsList(): List<Friend> {
        return listOf(
            Friend(R.drawable.ic_friend_example, "Alice"),
            Friend(R.drawable.ic_friend_example, "Bob"),
            Friend(R.drawable.ic_friend_example, "Charlie")
        )
    }
}
