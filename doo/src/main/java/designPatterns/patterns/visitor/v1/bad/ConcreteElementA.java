package designPatterns.patterns.visitor.v1.bad;

public class ConcreteElementA implements Element {

	@Override
	public void concreteA() {
		System.out.println("concreteA by ConcreteElementA");
	}

	@Override
	public void concreteB() {
		System.out.println("concreteB by ConcreteElementA");
	}

	

}
