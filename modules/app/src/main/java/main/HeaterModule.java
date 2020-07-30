package main;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import electricheater.ElectricHeater;
import heater.Heater;

@Module
public interface HeaterModule {
  @Singleton
  @Provides
  static Heater provideHeater() {
    return new ElectricHeater();
  }
}
