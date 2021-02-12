// Generated by Dagger (https://dagger.dev).
package com.example.hilt.inject_constructor_with_parameter;

import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMyComponent2 implements MyComponent2 {
  private DaggerMyComponent2() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static MyComponent2 create() {
    return new Builder().build();
  }

  @Override
  public MySubComponentFactory2.Factory getMySubComponentFactory() {
    return new MySubComponentFactory2Factory();
  }

  public static final class Builder {
    private Builder() {
    }

    public MyComponent2 build() {
      return new DaggerMyComponent2();
    }
  }

  private final class MySubComponentFactory2Factory implements MySubComponentFactory2.Factory {
    @Override
    public MySubComponentFactory2 create(String name) {
      Preconditions.checkNotNull(name);
      return new MySubComponentFactory2Impl(new MyModule2(), name);
    }
  }

  private final class MySubComponentFactory2Impl implements MySubComponentFactory2 {
    private final String name;

    private final MyModule2 myModule2;

    private volatile Object car4 = new MemoizedSentinel();

    private MySubComponentFactory2Impl(MyModule2 myModule2Param, String nameParam) {
      this.name = nameParam;
      this.myModule2 = myModule2Param;
    }

    private Car1 car1() {
      return new Car1(name);
    }

    private Car4 car4() {
      Object local = car4;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = car4;
          if (local instanceof MemoizedSentinel) {
            local = MyModule2_ProvideCar4Factory.provideCar4(myModule2, name);
            car4 = DoubleCheck.reentrantCheck(car4, local);
          }
        }
      }
      return (Car4) local;
    }

    @Override
    public void inject(MainActivity2 target) {
      injectMainActivity2(target);
    }

    private MainActivity2 injectMainActivity2(MainActivity2 instance) {
      MainActivity2_MembersInjector.injectCar1(instance, car1());
      MainActivity2_MembersInjector.injectCar4(instance, car4());
      return instance;
    }
  }
}