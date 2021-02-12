package com.example.koin.dataModule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/example/koin/dataModule/Data;", "Landroidx/lifecycle/ViewModel;", "()V", "_showMSG", "Landroidx/lifecycle/MutableLiveData;", "", "_showMSG2", "Lcom/example/koin/dataModule/Event;", "count", "", "count_", "showMSG", "Landroidx/lifecycle/LiveData;", "getShowMSG", "()Landroidx/lifecycle/LiveData;", "showMSG2", "getShowMSG2", "addCounter", "", "getCounter", "showMyMSG", "msg", "showMyMSG2", "koin_debug"})
public final class Data extends androidx.lifecycle.ViewModel {
    private int count_ = 0;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> count = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _showMSG = null;
    private final androidx.lifecycle.MutableLiveData<com.example.koin.dataModule.Event<java.lang.String>> _showMSG2 = null;
    
    public final void addCounter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCounter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getShowMSG() {
        return null;
    }
    
    public final void showMyMSG(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.koin.dataModule.Event<java.lang.String>> getShowMSG2() {
        return null;
    }
    
    public final void showMyMSG2(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public Data() {
        super();
    }
}