package electicgrinder;

import javax.inject.Inject;

import dagger.Reusable;
import grinder.Grinder;

@Reusable
public class ElectricGrinder implements Grinder {

  SomeStuff stuff;

  @Inject
  ElectricGrinder(SomeStuff stuff) {
    this.stuff = stuff;
  }

  @Override
  public void grind() {
  }

  @Override
  public String toString() {
    return "ElectricGrinder{" + "stuff=" + stuff + '}';
  }
}
