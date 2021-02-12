package com.example.hilt.dataModule;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class MyViewModel_AssistedFactory implements ViewModelAssistedFactory<MyViewModel> {
  private final Provider<Data> data;

  @Inject
  MyViewModel_AssistedFactory(Provider<Data> data) {
    this.data = data;
  }

  @Override
  @NonNull
  public MyViewModel create(SavedStateHandle arg0) {
    return new MyViewModel(data.get());
  }
}
