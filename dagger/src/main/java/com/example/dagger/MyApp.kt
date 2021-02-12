package com.example.dagger

import android.app.Application

class MyApp : Application() {
    var myComponent: MyComponent? = null
        private set

    override fun onCreate() {
        super.onCreate()

        myComponent = DaggerMyComponent.builder().contextModule(ContextModule(this)).build()

//            .builder().build()
    }
}



