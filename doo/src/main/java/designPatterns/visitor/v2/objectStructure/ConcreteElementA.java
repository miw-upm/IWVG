package designPatterns.visitor.v2.objectStructure;

public class ConcreteElementA implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

}
