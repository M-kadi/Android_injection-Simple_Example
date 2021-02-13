package com.example.koin

import android.app.Application
import com.example.koin.dataModule.MyViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()


        startKoin {
            androidContext(this@MyApp)
            //modules(listOf(appModule, repoModule, viewModelModule))
            modules(listOf(MyModule
                    // inject ViewModel
                    , MyViewModelModule))
        }

    }
}



