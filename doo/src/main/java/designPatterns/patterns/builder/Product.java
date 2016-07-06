package designPatterns.patterns.builder;

public abstract class Product {

	protected Product nextProduct;
	
	public Product() {
		nextProduct = null;
	}
	
	public void link(Product product) {
		this.nextProduct = product;
	}
	
	public Product getNextProduct(){
		return nextProduct;
	}
	
	public abstract void writeln();

}
