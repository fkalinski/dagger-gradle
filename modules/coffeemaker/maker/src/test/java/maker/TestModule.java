package maker;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import filter.Filter;
import grinder.Grinder;
import heater.Heater;
import logging.Logging;
import pump.Pump;

@Module
abstract class TestModule {

	@Provides
	static Logging provideLogging() {
		return System.out::println;
	}


	@Provides
	static Heater provideHeater() {
		return () -> {};
	}

	@Provides
	@IntoSet
	static Pump providePump() {
		return new Pump() {};
	}

	@Binds
	abstract Grinder bindGrinder(TestGrinder grinder);

	@Provides
	static Filter provideFilter(TestFilter testFilter) {
		return testFilter;
	}

}
