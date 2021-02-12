package com.example.hilt.inject_constructor_with_parameter

import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Named
import javax.inject.Singleton
@DisableInstallInCheck
@Module //(includes = [(PumpModule::class)])
internal class MyModule2 {


    @Provides
    @Singleton
    fun provideCar4(@Named("driver name") name: String): Car4 = Car4(name)



}