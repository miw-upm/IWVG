package designPatterns.patterns.visitor.v1.bad;

public class ConcreteElementB implements Element {

	@Override
	public void concreteA() {
		System.out.println("concreteA by ConcreteElementB");
	}

	@Override
	public void concreteB() {
		System.out.println("concreteB by ConcreteElementB");
	}

	

}
