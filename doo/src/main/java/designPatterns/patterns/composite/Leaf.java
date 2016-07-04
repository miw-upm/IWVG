package designPatterns.patterns.composite;

public class Leaf implements Component {

	@Override
	public void operation() {
		System.out.println("operation by Leaf");		
	}

}
