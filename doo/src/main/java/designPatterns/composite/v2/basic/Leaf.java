package designPatterns.composite.v2.basic;

public class Leaf implements Component {

	@Override
	public void operation() {
		System.out.println("operation by Leaf");		
	}

}
