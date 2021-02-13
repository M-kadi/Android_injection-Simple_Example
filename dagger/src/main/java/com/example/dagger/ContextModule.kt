package com.example.dagger

import android.content.Context
import android.content.SharedPreferences
import com.example.dagger.room.UserDao
import com.example.dagger.room.UserRepository
import com.example.dagger.room.UserRoomDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

//import com.awail.test_all_dagger.MyApplicationScope;
@Module
class ContextModule(private val context: Context) {
    @Provides
    @ApplicationContext
    fun  //    @MyApplicationScope
            provideContext(): Context {
        return context
    }

    //    @MyApplicationScope
    @Provides
    @Inject
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("PrefName", Context.MODE_PRIVATE)
    }

    // Inject Sqlite
    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String {
        return "demo-dagger.db"
    }

    // Inject Sqlite
    @Provides
    @DatabaseInfo
    fun provideDatabaseVersion(): Int {
        return 2
    }


}

// Inject Sqlite
@Qualifier
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationContext

@Qualifier
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class DatabaseInfo