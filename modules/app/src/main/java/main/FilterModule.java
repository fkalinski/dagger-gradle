package main;

import dagger.Binds;
import dagger.Module;
import fancyfilter.FancyFilter;
import filter.Filter;

@Module
public interface FilterModule {

  @Binds
  Filter provideFilter(FancyFilter filter);
}
