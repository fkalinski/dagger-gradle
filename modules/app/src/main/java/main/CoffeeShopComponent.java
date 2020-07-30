package main;

import javax.inject.Singleton;

import dagger.Subcomponent;
import maker.CoffeeMaker;

@Singleton
@Subcomponent(modules = {DripCoffeeModule.class, HeaterModule.class})
public interface CoffeeShopComponent {
  CoffeeMaker getMaker();

  void inject(Dump dump);
}
