package maker;

import org.immutables.value.Value;

import grinder.Grinder;

@Value.Immutable
public interface Coffee {
  Grinder grinder();

  String type();
}
