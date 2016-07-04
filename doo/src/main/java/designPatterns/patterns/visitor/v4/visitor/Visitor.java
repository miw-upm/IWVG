package designPatterns.patterns.visitor.v4.visitor;

public interface Visitor {

	void visitObjectStructure(ObjectStructure objectStructure);
	
	void visitConcreteElementA(ConcreteElementA concreteElementA);
	
	void visitConcreteElementB(ConcreteElementB concreteElementB);
}
