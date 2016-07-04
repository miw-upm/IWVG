package designPatterns.patterns.visitor.v2.objectStructure;

public class ConcreteElementB implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

}
