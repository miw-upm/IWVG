package designPatterns.patterns.visitor.v3.iterator;

import java.util.Iterator;

public class Client {

	private void exec() {
		//...
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementB());
		objectStructure.add(new ConcreteElementA());
		//...
		Iterator<Element> elementIterator;
		
		ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
		elementIterator = objectStructure.iterator();
		while (elementIterator.hasNext()) {
			elementIterator.next().accept(concreteVisitorA);
		}
		//...
		ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();
		elementIterator = objectStructure.iterator();
		while (elementIterator.hasNext()) {
			elementIterator.next().accept(concreteVisitorB);
		}
		//...
		
		
	}
	
	public static void main(String[] args){
		new Client().exec();
	}

}
