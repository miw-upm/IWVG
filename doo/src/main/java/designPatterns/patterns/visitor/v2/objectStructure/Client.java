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
		objectStructure.accept(new ConcreteVisitorA());
		//...
		objectStructure.accept(new ConcreteVisitorB());
		//...
		
		
	}
	
	public static void main(String[] args){
		new Client().exec();
	}

}
