package com.example.hilt.inject_constructor_with_parameter

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Car1 @Inject constructor(@Named("driver name") var name: String){

    fun maker() {
        Log.i("ooooo", "maker car1 $name " + this)
    }

    init {
        Log.d("TAG", "Car1 Constructor ----okokok---------------------------- $name")
    }
}