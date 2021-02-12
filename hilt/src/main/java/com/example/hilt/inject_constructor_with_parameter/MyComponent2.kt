package com.example.hilt.inject_constructor_with_parameter

import dagger.Component

//@Singleton
@Component//(modules = [MyModule::class])
interface MyComponent2 {


    fun getMySubComponentFactory(): MySubComponentFactory2.Factory

}
