package designPatterns.patterns.visitor.v3.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ObjectStructure {

	private ArrayList<Element> elementList;
	
	public ObjectStructure() {
		elementList = new ArrayList<Element>();
	}
	
	public void add(Element element){
		elementList.add(element);
	}

	public Iterator<Element> iterator() {
		return elementList.iterator();
	}
	
	
}
