package com.example.dagger

import com.example.dagger.dataModule.MyViewModel
import com.example.dagger.dataModule.ViewModelModule
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Subcomponent(modules = [MyModule::class, ViewModelModule::class])
interface MySubComponentFactory {

    fun inject(target: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("driver name") name: String
        ): MySubComponentFactory
    }
}
