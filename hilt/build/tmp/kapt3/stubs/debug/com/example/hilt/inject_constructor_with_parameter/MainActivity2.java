package com.example.hilt.inject_constructor_with_parameter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/example/hilt/inject_constructor_with_parameter/MainActivity2;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "car1", "Lcom/example/hilt/inject_constructor_with_parameter/Car1;", "getCar1", "()Lcom/example/hilt/inject_constructor_with_parameter/Car1;", "setCar1", "(Lcom/example/hilt/inject_constructor_with_parameter/Car1;)V", "car4", "Lcom/example/hilt/inject_constructor_with_parameter/Car4;", "getCar4", "()Lcom/example/hilt/inject_constructor_with_parameter/Car4;", "setCar4", "(Lcom/example/hilt/inject_constructor_with_parameter/Car4;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "hilt_debug"})
public final class MainActivity2 extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.example.hilt.inject_constructor_with_parameter.Car1 car1;
    @javax.inject.Inject()
    public com.example.hilt.inject_constructor_with_parameter.Car4 car4;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.hilt.inject_constructor_with_parameter.Car1 getCar1() {
        return null;
    }
    
    public final void setCar1(@org.jetbrains.annotations.NotNull()
    com.example.hilt.inject_constructor_with_parameter.Car1 p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.hilt.inject_constructor_with_parameter.Car4 getCar4() {
        return null;
    }
    
    public final void setCar4(@org.jetbrains.annotations.NotNull()
    com.example.hilt.inject_constructor_with_parameter.Car4 p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public MainActivity2() {
        super();
    }
}