package designPatterns.patterns.abstractFactory;

public class ConcreteProductBA implements AbstractProductB {

	@Override
	public void write() {
		System.out.println("ConcreteProductBA");
	}
}
