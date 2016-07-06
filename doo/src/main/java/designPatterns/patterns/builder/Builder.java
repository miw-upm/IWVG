package designPatterns.patterns.builder;

public abstract class Builder {

	protected Product product;
	
	public abstract void builderPartA();
	
	public abstract void builderPartB();
	
	public Product getResult() {
		return product;
	}
}
