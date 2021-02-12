package com.example.dagger

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Named

class Car1 @Inject constructor(@Named("driver name") var name: String){

    fun maker() {
        Log.i("ooooo", "maker car1 $name " + this)
    }

//    fun drive(){
//        Log.i("TAG", "drive  ----okokok---------------------------- $name")
//    }

    init {
        Log.d("TAG", "Car1 Constructor ----okokok---------------------------- $name")
    }
}