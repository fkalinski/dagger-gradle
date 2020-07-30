package electicgrinder;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;
import grinder.Grinder;

@Module(includes = StuffModule.class)
class ElectricGrinderModule {

  @Inject
  SomeStuff stuff3;

  @Provides
  Grinder provideGrinder(ElectricGrinder grinder, SomeStuff stuff2) {
    return () -> {
      stuff2.toString();
      stuff3.toString();
      grinder.grind();
    };
  }

}
