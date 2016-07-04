package designPatterns.exercises.n2_tickets.v1.store;

public class Product {

	private int price;
	
	@SuppressWarnings("unused")
	private int stock;
	
	public Product(int price, int units) {
		this.price = price;
		this.stock = units;
	}
	
	public int getPrice(int units) {
		return price*units;
	}
	
	public void add(int units){
		this.stock += units;
	}
	
	public void remove(int units){
		this.stock -= units;
	}
}
