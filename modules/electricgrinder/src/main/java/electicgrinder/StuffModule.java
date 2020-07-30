package electicgrinder;

import java.util.concurrent.atomic.AtomicInteger;

import dagger.Module;
import dagger.Provides;

@Module
abstract class StuffModule {

  private static final AtomicInteger counter = new AtomicInteger();

  private StuffModule() {}

  @Provides
  static SomeStuff provideStuff() {
    return new SomeStuff(String.valueOf(counter.incrementAndGet()));
  }
}
