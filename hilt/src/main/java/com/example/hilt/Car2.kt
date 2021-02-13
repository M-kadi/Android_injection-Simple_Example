package com.example.hilt

import android.util.Log
import javax.inject.Inject

class Car2 @Inject constructor(){
    fun maker() {
        Log.i("ooooo","maker car2 $this")
    }

}