package designPatterns.patterns.composite;

import java.util.ArrayList;

public class Composite implements Component {

	private ArrayList<Component> componentList;
	
	public Composite() {
		componentList = new ArrayList<Component>();
	}
	
	@Override
	public void operation() {
		System.out.println("operation by Composite");
		for(Component component : componentList){
			component.operation();
		}
	}
	
	public void add(Component component){
		componentList.add(component);
	}
	
	public void remove(Component component){
		componentList.remove(component);
	}

}
