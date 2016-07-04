package designPatterns.patterns.abstractFactory;

public class ConcreteProductAB implements AbstractProductA {

	@Override
	public void write() {
		System.out.println("ConcreteProductAB");
	}
}
