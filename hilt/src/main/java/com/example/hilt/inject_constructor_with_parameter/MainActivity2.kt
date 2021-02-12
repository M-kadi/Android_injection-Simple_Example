package com.example.hilt.inject_constructor_with_parameter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hilt.MyApp
import com.example.hilt.R
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {
    @Inject
    lateinit var car1: Car1

    @Inject
    lateinit var car4: Car4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val component = (application as MyApp).myComponent2?.getMySubComponentFactory()?.create("hello car1..")
        component?.inject(this)
        //..inject(this)

        Log.i("ooooooo","" + car1.maker())
        Log.i("ooooooo","" + car4.maker())

    }
}