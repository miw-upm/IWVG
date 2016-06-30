package designPatterns.visitor.v4.visitor;

public class ConcreteElementA implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

}
