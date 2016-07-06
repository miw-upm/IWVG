package designPatterns.patterns.visitor.v4.visitor;

public class Client {

	private void exec() {
		//...
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementB());
		objectStructure.add(new ConcreteElementA());
		//...
		new ConcreteVisitorA().visitObjectStructure(objectStructure);
		//...
		new ConcreteVisitorB().visitObjectStructure(objectStructure);		
	}
	
	public static void main(String[] args){
		new Client().exec();
	}

}
