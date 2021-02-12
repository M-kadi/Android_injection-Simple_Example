package com.example.dagger

import android.content.Context
import com.example.dagger.room.UserDao
import com.example.dagger.room.UserRepository
import com.example.dagger.room.UserRoomDatabase
import com.example.dagger.userList.UsersViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module //(includes = [(PumpModule::class)])
internal class MyModule {



    @Provides
    @Singleton
    fun provideCar3(): Car3 = Car3()

    @Provides
    @Singleton
    fun provideCar4(@Named("driver name") name: String): Car4 = Car4(name)

    @Provides
    @Named("constant_str")
    fun provideConstantStrString(): String = "my constant_str"


    //    @Provides
    //    IDriver2 bindDriver3();
//    @Provides
//    fun provideCar1(@Named("driver name") name: String): Car1 {
//        return Car1(name)
//    }

    // Inject room
    @Provides
    @Singleton
    fun provideUserDao(@ApplicationContext appContext: Context): UserDao =
        UserRoomDatabase.getDatabase(appContext).userDao()

    @Provides
    @Singleton
    fun provideUserRepository(userDao: UserDao): UserRepository = UserRepository(userDao)

    @Provides
    @Singleton
    fun provideUsersViewModel(userRepository: UserRepository): UsersViewModel = UsersViewModel(userRepository)

}