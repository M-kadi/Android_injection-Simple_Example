package com.example.hilt.dataModule;

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
    topLevelClass = MyViewModel.class
)
public interface MyViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.hilt.dataModule.MyViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(MyViewModel_AssistedFactory factory);
}
