package maker;

import dagger.Component;

@Component(modules = { TestModule.class})
public interface CoffeeMakerTestComponent {
	CoffeeMaker maker();

}
