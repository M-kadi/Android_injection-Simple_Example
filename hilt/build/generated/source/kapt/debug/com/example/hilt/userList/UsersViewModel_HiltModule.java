package com.example.hilt.userList;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = UsersViewModel.class
)
public interface UsersViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.hilt.userList.UsersViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(UsersViewModel_AssistedFactory factory);
}
