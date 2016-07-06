package designPatterns.patterns.builder;

public class ConcreteBuilderA extends Builder {

	@Override
	public void builderPartA() {
		Product product = new ProductAA();
		product.link(this.product);
		this.product = product;
	}

	@Override
	public void builderPartB() {
		Product product = new ProductAB();
		product.link(this.product);
		this.product = product;
	}

}
