package com.example.hilt

import android.content.SharedPreferences
import javax.inject.Inject

class MySharedPreferences @Inject constructor(private val mSharedPreferences: SharedPreferences) {
    // MySharedPreferences will Provides in Module : when not inject the constructor
//class MySharedPreferences  constructor(private val mSharedPreferences: SharedPreferences) {
    fun putData(key: String?, data: Int) {
        mSharedPreferences.edit().putInt(key, data).apply()
    }

    fun getData(key: String?): Int {
        return mSharedPreferences.getInt(key, 0)
    }

}