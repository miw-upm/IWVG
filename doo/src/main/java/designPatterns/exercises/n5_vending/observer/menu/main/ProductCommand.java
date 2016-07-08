package designPatterns.exercises.n5_vending.observer.menu.main;

import designPatterns.exercises.n5_vending.observer.Product;
import designPatterns.exercises.n5_vending.observer.devices.DeviceFacade;
import designPatterns.exercises.n5_vending.observer.menu.Command;
import designPatterns.exercises.n5_vending.observer.menu.sugar.SugarMenu;

public class ProductCommand extends Command {

	protected Product product;
	
	protected ProductCommand(Product product) {
		super(product.getDescription());
		this.product = product;
	}

	@Override
	public void execute() {
		SugarMenu sugarMenu = new SugarMenu(product);
		sugarMenu.execute();
		DeviceFacade.instance().removeCoffe(product.getCoffeConsumption());
		DeviceFacade.instance().removeSugar(product.getSugarConsumption());
		DeviceFacade.instance().removeWater(product.getWaterConsumption());
	}

}
