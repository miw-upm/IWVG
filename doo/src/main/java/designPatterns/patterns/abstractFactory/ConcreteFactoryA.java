package designPatterns.patterns.abstractFactory;

public class ConcreteFactoryA implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductAA();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductBA();
	}

}
