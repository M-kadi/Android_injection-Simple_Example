package com.example.hilt.inject_constructor_with_parameter

import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Subcomponent(modules = [MyModule2::class])
interface MySubComponentFactory2 {

    fun inject(target: MainActivity2)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("driver name") name: String
        ): MySubComponentFactory2
    }
}
