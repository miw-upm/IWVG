package designPatterns.exercises.n3_manager.v2.store;

public class Product {

	@SuppressWarnings("unused")
	private int code;

	private int amount;

	public Product(int code, int amount) {
		this.code = code;
		this.amount = amount;
	}

	public boolean exist(int amount) {
		return this.amount >= amount;
	}

	public void add(int amount) {
		this.amount += amount;
	}

	public void remove(int amount) {
		this.amount -= amount;
	}

	public int amount() {
		return amount;
	}

}
