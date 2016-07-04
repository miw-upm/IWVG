package designPatterns.patterns.visitor.v2.objectStructure;

import java.util.ArrayList;

public class ObjectStructure {

	private ArrayList<Element> elementList;
	
	public ObjectStructure() {
		elementList = new ArrayList<Element>();
	}
	
	public void add(Element element){
		elementList.add(element);
	}

	public void accept(Visitor visitor) {
		for(Element element : elementList){
			element.accept(visitor);
		}
	}
	
	
}
