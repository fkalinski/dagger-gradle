package main;

import dagger.BindsInstance;
import dagger.Component;
import dagger.multibindings.IntoSet;
import electicgrinder.ElectricGrinderComponent;
import filter.Filter;
import logging.Logging;

@Component(modules = RootModule.class, dependencies = ElectricGrinderComponent.class)
public interface RootComponent {

  Logging logging();

  CoffeeShopComponent coffeeShop();

  @Component.Builder
  interface Builder {
    Builder grinder(ElectricGrinderComponent component);

    @BindsInstance
    Builder filter(Filter filter);

    RootComponent build();
  }
}
