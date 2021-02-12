package com.example.hilt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/hilt/MyApp;", "Landroid/app/Application;", "()V", "<set-?>", "Lcom/example/hilt/inject_constructor_with_parameter/MyComponent2;", "myComponent2", "getMyComponent2", "()Lcom/example/hilt/inject_constructor_with_parameter/MyComponent2;", "onCreate", "", "hilt_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class MyApp extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private com.example.hilt.inject_constructor_with_parameter.MyComponent2 myComponent2;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.hilt.inject_constructor_with_parameter.MyComponent2 getMyComponent2() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public MyApp() {
        super();
    }
}