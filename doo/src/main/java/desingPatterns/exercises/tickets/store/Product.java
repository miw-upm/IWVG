package desingPatterns.exercises.tickets.store;

public class Product {

	private int price;
	
	@SuppressWarnings("unused")
	private int units;
	
	public Product(int price, int units) {
		this.price = price;
		this.units = units;
	}
	
	public int getPrice(int units) {
		return price*units;
	}
	
	public void add(int units){
		this.units += units;
	}
	
	public void remove(int units){
		this.units -= units;
	}
}
