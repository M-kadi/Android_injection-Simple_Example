package com.example.koin

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class Car1 constructor(var name: String){

    fun maker() {
        Log.i("ooooo","maker car1 $name " + this)
    }

//    fun drive(){
//        Log.i("ooooo","car1 drive  ----okokok---------------------------- $name")
//    }

    init {
        Log.d("ooooo", "car1 Constructor ----okokok---------------------------- $name")
    }
}