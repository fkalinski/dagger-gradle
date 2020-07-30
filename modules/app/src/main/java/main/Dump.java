package main;

import javax.inject.Inject;

import filter.Filter;

class Dump {
  @Inject Filter filter;

  Dump() {}

  @Override
  public String toString() {
    return "Dump{" + "filter=" + filter + '}';
  }
}
