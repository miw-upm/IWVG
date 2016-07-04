package designPatterns.patterns.visitor.v3.iterator;

public interface Visitor {

	void visitConcreteElementA(ConcreteElementA concreteElementA);
	
	void visitConcreteElementB(ConcreteElementB concreteElementB);
}
