// Generated by Dagger (https://dagger.dev).
package com.example.dagger;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Car2_Factory implements Factory<Car2> {
  @Override
  public Car2 get() {
    return newInstance();
  }

  public static Car2_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Car2 newInstance() {
    return new Car2();
  }

  private static final class InstanceHolder {
    private static final Car2_Factory INSTANCE = new Car2_Factory();
  }
}
