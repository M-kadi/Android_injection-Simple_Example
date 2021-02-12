// Generated by Dagger (https://dagger.dev).
package com.example.dagger;

import com.example.dagger.room.UserRepository;
import com.example.dagger.userList.UsersViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyModule_ProvideUsersViewModelFactory implements Factory<UsersViewModel> {
  private final MyModule module;

  private final Provider<UserRepository> userRepositoryProvider;

  public MyModule_ProvideUsersViewModelFactory(MyModule module,
      Provider<UserRepository> userRepositoryProvider) {
    this.module = module;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UsersViewModel get() {
    return provideUsersViewModel(module, userRepositoryProvider.get());
  }

  public static MyModule_ProvideUsersViewModelFactory create(MyModule module,
      Provider<UserRepository> userRepositoryProvider) {
    return new MyModule_ProvideUsersViewModelFactory(module, userRepositoryProvider);
  }

  public static UsersViewModel provideUsersViewModel(MyModule instance,
      UserRepository userRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideUsersViewModel(userRepository));
  }
}