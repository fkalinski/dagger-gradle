package main;

import electicgrinder.DaggerElectricGrinderComponent;
import fancyfilter.FancyFilter;
import maker.Coffee;
import maker.CoffeeMaker;

public class Main {
  public static void main(String[] args) {
    RootComponent rootComponent =
        DaggerRootComponent.builder()
            .grinder(DaggerElectricGrinderComponent.create())
            .filter(new FancyFilter())
            .build();

    CoffeeShopComponent coffeeShop = rootComponent.coffeeShop();

    CoffeeMaker maker = coffeeShop.getMaker();
    rootComponent.logging().log(maker.toString());

    Coffee coffee = maker.make();
    rootComponent.logging().log(coffee.toString());

    Dump dump = new Dump();
    coffeeShop.inject(dump);
    rootComponent.logging().log(dump.toString());
  }
}
