package com.example.hilt

import android.app.Application
import com.example.hilt.inject_constructor_with_parameter.DaggerMyComponent2
import com.example.hilt.inject_constructor_with_parameter.MyComponent2
import dagger.hilt.android.HiltAndroidApp



@HiltAndroidApp
class MyApp : Application()

{
    var myComponent2: MyComponent2? = null
        private set

    override fun onCreate() {
        super.onCreate()

        myComponent2 = DaggerMyComponent2.create()
//            .builder().build()
    }
}

