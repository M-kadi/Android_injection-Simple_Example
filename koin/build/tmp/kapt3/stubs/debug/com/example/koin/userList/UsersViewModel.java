package com.example.koin.userList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/koin/userList/UsersViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/koin/room/UserRepository;", "(Lcom/example/koin/room/UserRepository;)V", "allUsers", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/koin/room/User;", "getAllUsers", "()Landroidx/lifecycle/LiveData;", "deleteAllUsers", "", "insert", "user", "", "koin_debug"})
public final class UsersViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.koin.room.UserRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.koin.room.User>> getAllUsers() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    java.lang.String user) {
    }
    
    public final void deleteAllUsers() {
    }
    
    public UsersViewModel(@org.jetbrains.annotations.NotNull()
    com.example.koin.room.UserRepository repository) {
        super();
    }
}