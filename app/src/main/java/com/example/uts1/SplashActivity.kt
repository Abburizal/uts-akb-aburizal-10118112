package com.example.uts1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    // 12-13
    //10118122
    //Abbuizral Chillihyat
    //IF3-AKB-UL1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Simulate loading
        Thread {
            Thread.sleep(3000)

            val preferences = getSharedPreferences("app_prefs", MODE_PRIVATE)
            val walkthroughComplete = preferences.getBoolean("walkthrough_complete", false)

            val nextActivity = if (walkthroughComplete) {
                MainActivity::class.java
            } else {
                WalkthroughActivity::class.java
            }

            startActivity(Intent(this, nextActivity))
            finish()
        }.start()
    }
}
