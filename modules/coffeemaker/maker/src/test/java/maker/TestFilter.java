package maker;

import javax.inject.Inject;

import filter.Filter;
import logging.Logging;

public class TestFilter implements Filter {
	private final Logging logging;

	@Inject
	TestFilter(Logging logging) {
		this.logging = logging;
	}

	@Override
	public void filter() {
		logging.log("Filtering");
	}
}
