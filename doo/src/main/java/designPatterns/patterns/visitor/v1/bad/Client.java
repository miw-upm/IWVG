package designPatterns.patterns.visitor.v1.bad;

public class Client {

	private void exec() {
		//...
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementB());
		objectStructure.add(new ConcreteElementA());
		//...
		objectStructure.concreteA();
		//...
		objectStructure.concreteB();
	}
	
	public static void main(String[] args){
		new Client().exec();
	}

}
