// models/DailyActivity.kt
package com.example.uts1.models

import java.sql.Time

data class DailyActivity(
    val icon: Int,
    val title: String,
    val description: String,
    val time: Time,
    val details: String,
)
