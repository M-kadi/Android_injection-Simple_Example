package com.example.koin

import android.content.SharedPreferences

class MySharedPreferences constructor(private val  mSharedPreferences: SharedPreferences) {
    fun putData(key: String?, data: Int) {
        mSharedPreferences.edit().putInt(key, data).apply()
    }

    fun getData(key: String?): Int {
        return mSharedPreferences.getInt(key, 0)
    }
}