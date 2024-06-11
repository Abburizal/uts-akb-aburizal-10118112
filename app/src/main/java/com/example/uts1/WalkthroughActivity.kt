package com.example.uts1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.uts1.adapters.WalkthroughAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class WalkthroughActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrough)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val layouts = listOf(R.layout.page1, R.layout.page2, R.layout.page3)
        val adapter = WalkthroughAdapter(layouts)

        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            // You can set tab icons or text here if needed
        }.attach()

        findViewById<Button>(R.id.btn_get_started).setOnClickListener {
            // Simpan status walkthrough di SharedPreferences
            val preferences = getSharedPreferences("app_prefs", MODE_PRIVATE)
            with(preferences.edit()) {
                putBoolean("walkthrough_complete", true)
                apply()
            }
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
