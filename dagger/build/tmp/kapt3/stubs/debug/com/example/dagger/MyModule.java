package com.example.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/example/dagger/MyModule;", "", "()V", "provideCar3", "Lcom/example/dagger/Car3;", "provideCar4", "Lcom/example/dagger/Car4;", "name", "", "provideConstantStrString", "provideUserDao", "Lcom/example/dagger/room/UserDao;", "appContext", "Landroid/content/Context;", "provideUserRepository", "Lcom/example/dagger/room/UserRepository;", "userDao", "provideUsersViewModel", "Lcom/example/dagger/userList/UsersViewModel;", "userRepository", "dagger_debug"})
@dagger.Module()
public final class MyModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.dagger.Car3 provideCar3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.dagger.Car4 provideCar4(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "driver name")
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "constant_str")
    @dagger.Provides()
    public final java.lang.String provideConstantStrString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.dagger.room.UserDao provideUserDao(@org.jetbrains.annotations.NotNull()
    @ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.dagger.room.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.example.dagger.room.UserDao userDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.dagger.userList.UsersViewModel provideUsersViewModel(@org.jetbrains.annotations.NotNull()
    com.example.dagger.room.UserRepository userRepository) {
        return null;
    }
    
    public MyModule() {
        super();
    }
}