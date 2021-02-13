package com.example.hilt.inject_constructor_with_parameter

import android.util.Log
import javax.inject.Named

class Car4 constructor(@Named("driver name") var name: String){

    fun maker() {
        Log.i("ooooo", "maker car4 $name " + this)
    }

    init {
        Log.d("TAG", "Car4 Constructor ----okokok---------------------------- $name")
    }
}