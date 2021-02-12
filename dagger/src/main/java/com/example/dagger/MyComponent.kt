package com.example.dagger

import com.example.dagger.dataModule.MyViewModel
import dagger.Component

//@Singleton
@Component(modules = [ContextModule::class])
interface MyComponent {




    fun getMySubComponentFactory(): MySubComponentFactory.Factory




}
