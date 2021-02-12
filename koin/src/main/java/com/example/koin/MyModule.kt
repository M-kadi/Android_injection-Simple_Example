package com.example.koin

//import dagger.Module
//import dagger.Provides
import android.content.Context
import android.content.SharedPreferences
import android.graphics.ColorSpace.get
import androidx.lifecycle.SavedStateHandle
import com.example.koin.dataModule.Data
import com.example.koin.room.UserRepository
import com.example.koin.room.UserRoomDatabase
import com.example.koin.sqlite.DbHelper
import com.example.koin.userList.UsersViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

//import javax.inject.Singleton

//@Module //(includes = [(PumpModule::class)])
//internal class MyModule {

val MyModule = module {
//    @Provides
//    @Singleton
//    fun provideHeater(): Heater {
//        return ElectricHeater()
//    }
//
////    @Provides fun maker3(): CoffeeMaker3 {
////        return CoffeeMaker3()
////    }
//
////    @Provides
////    @Singleton
////    fun provideHomepagePresenter(): HomepagePresenter = HomepagePresenterImpl()
//
//    @Provides
//    @Singleton
//    fun provideHomepagePresenter(): CoffeeMaker3 = CoffeeMaker3Impl()
//
//    @Provides
//    @Singleton
//    fun provideCoffeeMaker3(): CoffeeMaker3 = CoffeeMaker3()
//
//    @Provides
//    @Singleton
//    fun provideCar(): CarImpl = Car()

//    @Provides
//    @Singleton
//    fun provideCar3(): Car3 = Car3()

    // inject ViewModel
    single { Data() }

    single { Car3() }
    single { Car2() }

    single{ (name : String) -> Car1(name) }

    single { provideSharedPreferences(androidContext()) }

    single{ MySharedPreferences(get()) }


    single(qualifier = named("constant_str")) { "my constant_str" }


    single { DbHelper(androidContext(),"demo-koin.db",2) }


    // room
    factory { UserRoomDatabase.getDatabase(androidApplication()).userDao() }
    factory { UserRepository(get()) }

    viewModel {
        UsersViewModel(get())
    }

}

private fun provideSharedPreferences(context: Context) : SharedPreferences =
        context.getSharedPreferences("PrefName", Context.MODE_PRIVATE)




