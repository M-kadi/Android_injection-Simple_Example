package com.example.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/dagger/MySubComponentFactory;", "", "inject", "", "target", "Lcom/example/dagger/MainActivity;", "Factory", "dagger_debug"})
@dagger.Subcomponent(modules = {com.example.dagger.MyModule.class, com.example.dagger.dataModule.ViewModelModule.class})
@javax.inject.Singleton()
public abstract interface MySubComponentFactory {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.dagger.MainActivity target);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/dagger/MySubComponentFactory$Factory;", "", "create", "Lcom/example/dagger/MySubComponentFactory;", "name", "", "dagger_debug"})
    @dagger.Subcomponent.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.dagger.MySubComponentFactory create(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "driver name")
        @dagger.BindsInstance()
        java.lang.String name);
    }
}