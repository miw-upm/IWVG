package designPatterns.patterns.factoryMethod;

public class ConcreteCreatorA extends Creator {

	@Override
	protected Product factoryMethod() {
		return new ProductA();
	}

}
