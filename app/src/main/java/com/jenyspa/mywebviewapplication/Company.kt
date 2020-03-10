package com.jenyspa.mywebviewapplication

import android.content.SharedPreferences

class Company(
    val name: String,
    val url: String
) {
    fun getClicks(sharedPreferences: SharedPreferences) =
        sharedPreferences.getInt("click${name}", 0)
}