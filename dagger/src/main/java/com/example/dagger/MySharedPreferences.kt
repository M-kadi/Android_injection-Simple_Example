package com.example.dagger

import android.content.SharedPreferences
import javax.inject.Inject

class MySharedPreferences @Inject constructor(private val mSharedPreferences: SharedPreferences) {
    fun putData(key: String?, data: Int) {
        mSharedPreferences.edit().putInt(key, data).apply()
    }

    fun getData(key: String?): Int {
        return mSharedPreferences.getInt(key, 0)
    }

}