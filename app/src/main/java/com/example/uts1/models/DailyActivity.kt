// models/DailyActivity.kt
package com.example.uts1.models

import java.sql.Time

data class DailyActivity(
    // 12-13
    //10118122
    //Abbuizral Chillihyat
    //IF3-AKB-UL1

    val icon: Int,
    val title: String,
    val description: String,
    val time: Time,
    val details: String,
)
