package designPatterns.patterns.builder;

public class ConcreteBuilderB extends Builder {

	@Override
	public void builderPartA() {
		Product product = new ProductBA();
		if (this.product == null) {
			this.product = product;
		} else {
			Product actual = this.product;
			while (actual.getNextProduct() != null) {
				actual = actual.getNextProduct();
			}
			actual.link(this.product);
		}
	}

	@Override
	public void builderPartB() {
		Product product = new ProductBB();
		if (this.product == null) {
			this.product = product;
		} else {
			Product actual = this.product;
			while (actual.getNextProduct() != null) {
				actual = actual.getNextProduct();
			}
			actual.link(this.product);
		}
	}
}
