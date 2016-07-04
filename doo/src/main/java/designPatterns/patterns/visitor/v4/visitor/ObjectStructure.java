package designPatterns.patterns.visitor.v4.visitor;

import java.util.ArrayList;

public class ObjectStructure {

	private ArrayList<Element> elementList;
	
	public ObjectStructure() {
		elementList = new ArrayList<Element>();
	}
	
	public void add(Element element){
		elementList.add(element);
	}
	
	public ArrayList<Element> getElementList() {
		return elementList;
	}
	
}
