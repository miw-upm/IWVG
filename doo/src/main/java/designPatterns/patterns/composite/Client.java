package designPatterns.patterns.composite;

public class Client {

	private void exec() {
		//...
		Leaf leaf1 = new Leaf();
		Leaf leaf2 = new Leaf();
		Composite composite1 = new Composite();
		composite1.add(leaf1);
		composite1.add(leaf2);
		Leaf leaf3 = new Leaf();
		Composite composite2 = new Composite();
		composite2.add(leaf3);
		composite2.add(composite1);
		//...
		Component component;
		//...
		component = leaf2;
		component.operation();
		//...
		component = composite2;
		component.operation();
		//...
	}
	
	public static void main(String[] args){
		new Client().exec();
	}
}
