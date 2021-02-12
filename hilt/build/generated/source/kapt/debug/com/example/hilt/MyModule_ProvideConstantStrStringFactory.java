// Generated by Dagger (https://dagger.dev).
package com.example.hilt;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyModule_ProvideConstantStrStringFactory implements Factory<String> {
  private final MyModule module;

  public MyModule_ProvideConstantStrStringFactory(MyModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideConstantStrString(module);
  }

  public static MyModule_ProvideConstantStrStringFactory create(MyModule module) {
    return new MyModule_ProvideConstantStrStringFactory(module);
  }

  public static String provideConstantStrString(MyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideConstantStrString());
  }
}
