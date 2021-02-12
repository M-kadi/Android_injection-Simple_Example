package com.example.hilt.userList;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.hilt.room.UserRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class UsersViewModel_AssistedFactory implements ViewModelAssistedFactory<UsersViewModel> {
  private final Provider<UserRepository> repository;

  @Inject
  UsersViewModel_AssistedFactory(Provider<UserRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public UsersViewModel create(SavedStateHandle arg0) {
    return new UsersViewModel(repository.get());
  }
}
