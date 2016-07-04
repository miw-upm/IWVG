package designPatterns.patterns.visitor.v1.bad;

import java.util.ArrayList;

public class ObjectStructure {

	private ArrayList<Element> elementList;
	
	public ObjectStructure() {
		elementList = new ArrayList<Element>();
	}
	
	public void add(Element element){
		elementList.add(element);
	}

	public void concreteA() {
		for(Element element : elementList) {
			element.concreteA();
		}
	}

	public void concreteB() {
		for(Element element : elementList) {
			element.concreteB();
		}
	}
	
	
}
