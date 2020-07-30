package main;

import dagger.Binds;
import dagger.Module;
import logging.Logging;
import slf4jlogging.Slf4jLogging;

@Module
public interface RootModule {
  @Binds
  Logging bind(Slf4jLogging logging);
}
