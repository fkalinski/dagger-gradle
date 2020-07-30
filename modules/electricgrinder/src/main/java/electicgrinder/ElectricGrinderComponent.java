package electicgrinder;

import dagger.Component;
import grinder.Grinder;

@Component(modules = {ElectricGrinderModule.class})
public interface ElectricGrinderComponent {
  Grinder getGrinder();
}
