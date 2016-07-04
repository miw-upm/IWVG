package designPatterns.patterns.abstractFactory;

public class ConcreteFactoryB implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductAB();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductBB();
	}

}
