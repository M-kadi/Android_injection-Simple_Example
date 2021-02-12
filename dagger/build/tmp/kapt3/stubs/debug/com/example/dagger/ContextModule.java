package com.example.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/dagger/ContextModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "provideContext", "provideDatabaseName", "", "provideDatabaseVersion", "", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "dagger_debug"})
@dagger.Module()
public final class ContextModule {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @ApplicationContext()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    @ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @DatabaseInfo()
    @dagger.Provides()
    public final java.lang.String provideDatabaseName() {
        return null;
    }
    
    @DatabaseInfo()
    @dagger.Provides()
    public final int provideDatabaseVersion() {
        return 0;
    }
    
    public ContextModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}