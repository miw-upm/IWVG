package designPatterns.exercises.n5_vending.basic.menu.sugar;

import designPatterns.exercises.n5_vending.basic.Product;
import designPatterns.exercises.n5_vending.basic.menu.Command;

public class SugarCommand extends Command{

	private int sugarConsumption;
	
	private Product product;
	
	public SugarCommand(String description, int sugarConsumption, Product product) {
		super(description);
		this.sugarConsumption = sugarConsumption;
		this.product = product;
	}

	@Override
	public void execute() {
		product.setSugarConsumption(sugarConsumption);
	}

}
