package maker;

import org.junit.Assert;
import org.junit.Test;

public class CoffeeMakerTest {

	@Test
	public void testMaker() {
		CoffeeMaker maker = new CoffeeMaker(
				() -> () -> {},
				null,
				() -> {},
				() -> new TestFilter(System.out::println),
				null
		);

		Coffee coffee = maker.make();
		Assert.assertNotNull(coffee);
	}

	@Test
	public void testMakerAssembled() {
		CoffeeMaker maker = DaggerCoffeeMakerTestComponent.builder().build().maker();
		Coffee coffee = maker.make();
		Assert.assertNotNull(coffee);
	}

}
