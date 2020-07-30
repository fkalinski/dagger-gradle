package maker;

import java.util.Set;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;
import filter.Filter;
import grinder.Grinder;
import heater.Heater;
import pump.Pump;

public class CoffeeMaker {
  private final Lazy<Heater> heater;

  private final Set<Pump> pump;

  private final Grinder grinder;

  private final Provider<Filter> filterProvider;

  @Nullable
  private final Thingy thingy;

  @Inject
  CoffeeMaker(Lazy<Heater> heater, Set<Pump> pump, Grinder grinder,
          Provider<Filter> filterProvider, Thingy thingy) {
    this.heater = heater;
    this.pump = pump;
    this.grinder = grinder;
    this.filterProvider = filterProvider;
    this.thingy = thingy;
  }

  public Coffee make() {
    Filter filter = filterProvider.get();
    filter.filter();
    heater.get().heat();
    return ImmutableCoffee.builder().type("Some Cofee").grinder(grinder).build();
  }

  @Override
  public String toString() {
    return "CoffeeMaker{"
        + "heater="
        + heater
        + ", pump="
        + pump
        + ", grinder="
        + grinder
        + ", filterProvider="
        + filterProvider
        + '}';
  }
}
