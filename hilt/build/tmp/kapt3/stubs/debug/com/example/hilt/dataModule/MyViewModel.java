package com.example.hilt.dataModule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/hilt/dataModule/MyViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "data", "Lcom/example/hilt/dataModule/Data;", "(Lcom/example/hilt/dataModule/Data;)V", "addCounter", "", "getCounter", "Landroidx/lifecycle/LiveData;", "", "onPause", "Companion", "hilt_debug"})
public final class MyViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final com.example.hilt.dataModule.Data data = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY = "DefaultKey";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.hilt.dataModule.MyViewModel.Companion Companion = null;
    
    public final void addCounter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCounter() {
        return null;
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MyViewModel(@org.jetbrains.annotations.NotNull()
    com.example.hilt.dataModule.Data data) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/hilt/dataModule/MyViewModel$Companion;", "", "()V", "KEY", "", "hilt_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}