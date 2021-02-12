package com.example.hilt.inject_constructor_with_parameter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/hilt/inject_constructor_with_parameter/MyModule2;", "", "()V", "provideCar4", "Lcom/example/hilt/inject_constructor_with_parameter/Car4;", "name", "", "hilt_debug"})
@dagger.Module()
@dagger.hilt.migration.DisableInstallInCheck()
public final class MyModule2 {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.hilt.inject_constructor_with_parameter.Car4 provideCar4(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "driver name")
    java.lang.String name) {
        return null;
    }
    
    public MyModule2() {
        super();
    }
}