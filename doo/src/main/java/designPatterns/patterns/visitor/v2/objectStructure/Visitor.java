package designPatterns.patterns.visitor.v2.objectStructure;

public interface Visitor {

	void visitConcreteElementA(ConcreteElementA concreteElementA);
	
	void visitConcreteElementB(ConcreteElementB concreteElementB);
}
