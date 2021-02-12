package com.example.koin.sqlite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0011\u0010\t\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/example/koin/sqlite/DbHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "dbName", "", "version", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)V", "currentTimeStamp", "getCurrentTimeStamp", "()Ljava/lang/String;", "getUser", "Lcom/example/koin/sqlite/User;", "userId", "", "insertUser", "user", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "tableCreateStatements", "Companion", "koin_debug"})
public final class DbHelper extends android.database.sqlite.SQLiteOpenHelper {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_TABLE_NAME = "users";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_COLUMN_USER_ID = "id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_COLUMN_USER_NAME = "usr_name";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.koin.sqlite.DbHelper.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override()
    public void onUpgrade(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    private final void tableCreateStatements(android.database.sqlite.SQLiteDatabase db) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.koin.sqlite.User getUser(long userId) throws android.content.res.Resources.NotFoundException, java.lang.NullPointerException {
        return null;
    }
    
    public final long insertUser(@org.jetbrains.annotations.NotNull()
    com.example.koin.sqlite.User user) throws java.lang.Exception {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentTimeStamp() {
        return null;
    }
    
    public DbHelper(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String dbName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer version) {
        super(null, null, null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/koin/sqlite/DbHelper$Companion;", "", "()V", "USER_COLUMN_USER_ID", "", "USER_COLUMN_USER_NAME", "USER_TABLE_NAME", "koin_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}