package designPatterns.patterns.visitor.v4.visitor;

public class ConcreteVisitorB implements Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println("visitConcreteElementA by ConcreteVisitorB");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println("visitConcreteElementB by ConcreteVisitorB");
	}
	
	@Override
	public void visitObjectStructure(ObjectStructure objectStructure) {
		for(Element element : objectStructure.getElementList()) {
			element.accept(this);
		}
	}

}
