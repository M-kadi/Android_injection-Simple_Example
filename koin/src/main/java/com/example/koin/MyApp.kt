package com.example.koin

import android.app.Application
import com.example.koin.dataModule.MyViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
//    var myComponent: MyComponent? = null
//        private set

    override fun onCreate() {
        super.onCreate()

//        myComponent = DaggerMyComponent
//            .builder().build()

        startKoin {
            androidContext(this@MyApp)
            //modules(listOf(appModule, repoModule, viewModelModule))
            modules(listOf(MyModule
                    // inject ViewModel
                    , MyViewModelModule))
        }

    }
}



