package designPatterns.exercises.n5_vending.basic;

public class Product {

	private String description;
	
	private int waterConsumption;
	
	private int sugarConsumption;
	
	private int coffeConsumption;
	
	public Product(String description, int waterConsumption, int coffeConsumption){
		this.description = description;
		this.waterConsumption = waterConsumption;
		this.coffeConsumption = coffeConsumption;
	}
	
	public void setSugarConsumption(int sugarConsumption) {
		this.sugarConsumption = sugarConsumption;
	}
	
	public String getDescription(){
		return description;
	}

	public int getCoffeConsumption() {
		return coffeConsumption;
	}

	public int getSugarConsumption() {
		return sugarConsumption;
	}

	public int getWaterConsumption() {
		return waterConsumption;
	}

}
