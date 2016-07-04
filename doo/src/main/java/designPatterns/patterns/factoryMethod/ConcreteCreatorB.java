package designPatterns.patterns.factoryMethod;

public class ConcreteCreatorB extends Creator {

	@Override
	protected Product factoryMethod() {
		return new ProductB();
	}

}