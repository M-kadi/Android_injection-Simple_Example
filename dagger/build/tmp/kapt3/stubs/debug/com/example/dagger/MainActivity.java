package com.example.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005efghiB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010a\u001a\u00020b2\b\u0010c\u001a\u0004\u0018\u00010dH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0015\u00109\u001a\u00060:R\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0015\u0010=\u001a\u00060>R\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0015\u0010A\u001a\u00060BR\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0015\u0010E\u001a\u00060FR\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0015\u0010I\u001a\u00060JR\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020\"0NX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010O\u001a\u00020P8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010U\u001a\u00020V8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001e\u0010[\u001a\u00020\\8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`\u00a8\u0006j"}, d2 = {"Lcom/example/dagger/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "car1", "Lcom/example/dagger/Car1;", "getCar1", "()Lcom/example/dagger/Car1;", "setCar1", "(Lcom/example/dagger/Car1;)V", "car2", "Lcom/example/dagger/Car2;", "getCar2", "()Lcom/example/dagger/Car2;", "setCar2", "(Lcom/example/dagger/Car2;)V", "car3", "Lcom/example/dagger/Car3;", "getCar3", "()Lcom/example/dagger/Car3;", "setCar3", "(Lcom/example/dagger/Car3;)V", "car4", "Lcom/example/dagger/Car4;", "getCar4", "()Lcom/example/dagger/Car4;", "setCar4", "(Lcom/example/dagger/Car4;)V", "component", "Lcom/example/dagger/MySubComponentFactory;", "getComponent", "()Lcom/example/dagger/MySubComponentFactory;", "setComponent", "(Lcom/example/dagger/MySubComponentFactory;)V", "constant_str", "", "getConstant_str", "()Ljava/lang/String;", "setConstant_str", "(Ljava/lang/String;)V", "dbHelper", "Lcom/example/dagger/sqlite/DbHelper;", "getDbHelper", "()Lcom/example/dagger/sqlite/DbHelper;", "setDbHelper", "(Lcom/example/dagger/sqlite/DbHelper;)V", "mySharedPreferences", "Lcom/example/dagger/MySharedPreferences;", "getMySharedPreferences", "()Lcom/example/dagger/MySharedPreferences;", "setMySharedPreferences", "(Lcom/example/dagger/MySharedPreferences;)V", "repository", "Lcom/example/dagger/room/UserRepository;", "getRepository", "()Lcom/example/dagger/room/UserRepository;", "setRepository", "(Lcom/example/dagger/room/UserRepository;)V", "testClassConstructor", "Lcom/example/dagger/MainActivity$TestClassConstructor;", "getTestClassConstructor", "()Lcom/example/dagger/MainActivity$TestClassConstructor;", "testRoom", "Lcom/example/dagger/MainActivity$TestRoom;", "getTestRoom", "()Lcom/example/dagger/MainActivity$TestRoom;", "testSharedPreferences", "Lcom/example/dagger/MainActivity$TestSharedPreferences;", "getTestSharedPreferences", "()Lcom/example/dagger/MainActivity$TestSharedPreferences;", "testSqlite", "Lcom/example/dagger/MainActivity$TestSqlite;", "getTestSqlite", "()Lcom/example/dagger/MainActivity$TestSqlite;", "testViewModel", "Lcom/example/dagger/MainActivity$TestViewModel;", "getTestViewModel", "()Lcom/example/dagger/MainActivity$TestViewModel;", "textDataObserver", "Landroidx/lifecycle/Observer;", "userDao", "Lcom/example/dagger/room/UserDao;", "getUserDao", "()Lcom/example/dagger/room/UserDao;", "setUserDao", "(Lcom/example/dagger/room/UserDao;)V", "usersViewModel", "Lcom/example/dagger/userList/UsersViewModel;", "getUsersViewModel", "()Lcom/example/dagger/userList/UsersViewModel;", "setUsersViewModel", "(Lcom/example/dagger/userList/UsersViewModel;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "TestClassConstructor", "TestRoom", "TestSharedPreferences", "TestSqlite", "TestViewModel", "dagger_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Named(value = "constant_str")
    @javax.inject.Inject()
    public java.lang.String constant_str;
    @org.jetbrains.annotations.Nullable()
    private com.example.dagger.MySubComponentFactory component;
    @javax.inject.Inject()
    public com.example.dagger.Car1 car1;
    @javax.inject.Inject()
    public com.example.dagger.Car2 car2;
    @javax.inject.Inject()
    public com.example.dagger.Car3 car3;
    @javax.inject.Inject()
    public com.example.dagger.Car4 car4;
    @org.jetbrains.annotations.NotNull()
    private final com.example.dagger.MainActivity.TestClassConstructor testClassConstructor = null;
    @javax.inject.Inject()
    public com.example.dagger.MySharedPreferences mySharedPreferences;
    @org.jetbrains.annotations.NotNull()
    private final com.example.dagger.MainActivity.TestSharedPreferences testSharedPreferences = null;
    private final androidx.lifecycle.Observer<java.lang.String> textDataObserver = null;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final com.example.dagger.MainActivity.TestViewModel testViewModel = null;
    @javax.inject.Inject()
    public com.example.dagger.sqlite.DbHelper dbHelper;
    @org.jetbrains.annotations.NotNull()
    private final com.example.dagger.MainActivity.TestSqlite testSqlite = null;
    @javax.inject.Inject()
    public com.example.dagger.userList.UsersViewModel usersViewModel;
    @javax.inject.Inject()
    public com.example.dagger.room.UserDao userDao;
    @javax.inject.Inject()
    public com.example.dagger.room.UserRepository repository;
    @org.jetbrains.annotations.NotNull()
    private final com.example.dagger.MainActivity.TestRoom testRoom = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConstant_str() {
        return null;
    }
    
    public final void setConstant_str(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.dagger.MySubComponentFactory getComponent() {
        return null;
    }
    
    public final void setComponent(@org.jetbrains.annotations.Nullable()
    com.example.dagger.MySubComponentFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.Car1 getCar1() {
        return null;
    }
    
    public final void setCar1(@org.jetbrains.annotations.NotNull()
    com.example.dagger.Car1 p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.Car2 getCar2() {
        return null;
    }
    
    public final void setCar2(@org.jetbrains.annotations.NotNull()
    com.example.dagger.Car2 p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.Car3 getCar3() {
        return null;
    }
    
    public final void setCar3(@org.jetbrains.annotations.NotNull()
    com.example.dagger.Car3 p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.Car4 getCar4() {
        return null;
    }
    
    public final void setCar4(@org.jetbrains.annotations.NotNull()
    com.example.dagger.Car4 p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.MainActivity.TestClassConstructor getTestClassConstructor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.MySharedPreferences getMySharedPreferences() {
        return null;
    }
    
    public final void setMySharedPreferences(@org.jetbrains.annotations.NotNull()
    com.example.dagger.MySharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.MainActivity.TestSharedPreferences getTestSharedPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.MainActivity.TestViewModel getTestViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.sqlite.DbHelper getDbHelper() {
        return null;
    }
    
    public final void setDbHelper(@org.jetbrains.annotations.NotNull()
    com.example.dagger.sqlite.DbHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.MainActivity.TestSqlite getTestSqlite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.userList.UsersViewModel getUsersViewModel() {
        return null;
    }
    
    public final void setUsersViewModel(@org.jetbrains.annotations.NotNull()
    com.example.dagger.userList.UsersViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.room.UserDao getUserDao() {
        return null;
    }
    
    public final void setUserDao(@org.jetbrains.annotations.NotNull()
    com.example.dagger.room.UserDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.room.UserRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.dagger.room.UserRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger.MainActivity.TestRoom getTestRoom() {
        return null;
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/dagger/MainActivity$TestClassConstructor;", "", "(Lcom/example/dagger/MainActivity;)V", "test", "", "dagger_debug"})
    public final class TestClassConstructor {
        
        public final void test() {
        }
        
        public TestClassConstructor() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/dagger/MainActivity$TestSharedPreferences;", "", "(Lcom/example/dagger/MainActivity;)V", "test", "", "dagger_debug"})
    public final class TestSharedPreferences {
        
        public final void test() {
        }
        
        public TestSharedPreferences() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/dagger/MainActivity$TestViewModel;", "", "(Lcom/example/dagger/MainActivity;)V", "test", "", "dagger_debug"})
    public final class TestViewModel {
        
        public final void test() {
        }
        
        public TestViewModel() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/dagger/MainActivity$TestSqlite;", "", "(Lcom/example/dagger/MainActivity;)V", "test", "", "dagger_debug"})
    public final class TestSqlite {
        
        public final void test() {
        }
        
        public TestSqlite() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002\u00a8\u0006\b"}, d2 = {"Lcom/example/dagger/MainActivity$TestRoom;", "", "(Lcom/example/dagger/MainActivity;)V", "test", "", "testRoomUserList", "test_insert_room", "test_show_room", "dagger_debug"})
    public final class TestRoom {
        
        public final void test() {
        }
        
        private final void testRoomUserList() {
        }
        
        private final void test_insert_room() {
        }
        
        private final void test_show_room() {
        }
        
        public TestRoom() {
            super();
        }
    }
}