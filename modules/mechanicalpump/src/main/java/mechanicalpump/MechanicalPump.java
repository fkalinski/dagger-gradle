package mechanicalpump;

import javax.inject.Inject;
import javax.inject.Singleton;

import logging.Logging;
import pump.Pump;

@Singleton
public class MechanicalPump implements Pump {

  private final Logging logging;

  @Inject
  MechanicalPump(Logging logging) {
    this.logging = logging;
  }

  @Override
  public String toString() {
    return "MechanicalPump{" + "logging=" + logging + '}';
  }
}
