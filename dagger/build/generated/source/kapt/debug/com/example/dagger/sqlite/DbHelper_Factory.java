// Generated by Dagger (https://dagger.dev).
package com.example.dagger.sqlite;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DbHelper_Factory implements Factory<DbHelper> {
  private final Provider<Context> contextProvider;

  private final Provider<String> dbNameProvider;

  private final Provider<Integer> versionProvider;

  public DbHelper_Factory(Provider<Context> contextProvider, Provider<String> dbNameProvider,
      Provider<Integer> versionProvider) {
    this.contextProvider = contextProvider;
    this.dbNameProvider = dbNameProvider;
    this.versionProvider = versionProvider;
  }

  @Override
  public DbHelper get() {
    return newInstance(contextProvider.get(), dbNameProvider.get(), versionProvider.get());
  }

  public static DbHelper_Factory create(Provider<Context> contextProvider,
      Provider<String> dbNameProvider, Provider<Integer> versionProvider) {
    return new DbHelper_Factory(contextProvider, dbNameProvider, versionProvider);
  }

  public static DbHelper newInstance(Context context, String dbName, Integer version) {
    return new DbHelper(context, dbName, version);
  }
}
