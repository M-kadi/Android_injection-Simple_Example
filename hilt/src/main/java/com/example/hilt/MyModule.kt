package com.example.hilt

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.example.hilt.room.UserDao
import com.example.hilt.room.UserRepository
import com.example.hilt.room.UserRoomDatabase
import com.example.hilt.sqlite.DbHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

    @Module
    @InstallIn(SingletonComponent::class)
    class MyModule {

        @Provides
        @Singleton
        fun provideCar3(): Car3 = Car3()

        @Provides
        @Singleton
        fun provideSharedPreferences(@ApplicationContext context : Context): SharedPreferences =
                context.getSharedPreferences("PrefName", Context.MODE_PRIVATE)


        // MySharedPreferences will Provides in Module : when not inject the constructor
//        @Provides
//        @Singleton
//        fun provideMySharedPreferences(mSharedPreferences: SharedPreferences): MySharedPreferences =
//                MySharedPreferences(mSharedPreferences)


        @Provides
        @Named("constant_str")
        fun provideConstantStrString(): String = "my constant_str"

        // Inject Sqlite
        @Provides
        @Singleton
        fun provideDbHelper(@ApplicationContext context : Context): DbHelper = DbHelper(context, "demo-dagger.db", 2)


        // Inject room
        @Provides
        @Singleton
        fun provideUserDao(@ApplicationContext appContext: Context): UserDao =
            UserRoomDatabase.getDatabase(appContext).userDao()

        @Provides
        @Singleton
        fun provideUserRepository(userDao: UserDao): UserRepository = UserRepository(userDao)

    }

