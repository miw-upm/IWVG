package designPatterns.patterns.visitor.v2.objectStructure;

public class Client {

	private void exec() {
		//...
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementB());
		objectStructure.add(new ConcreteElementA());
		//...
		ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
		objectStructure.accept(concreteVisitorA);
		//...
		ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();
		objectStructure.accept(concreteVisitorB);
		//...
		
		
	}
	
	public static void main(String[] args){
		new Client().exec();
	}

}
