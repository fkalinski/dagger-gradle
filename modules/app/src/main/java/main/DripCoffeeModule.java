package main;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;
import mechanicalpump.MechanicalPump;
import pump.Pump;

@Module
public interface DripCoffeeModule {
  @Binds @IntoSet
  Pump providePump(MechanicalPump pump);
}
