package designPatterns.exercises.n5_vending.observer.menu.manager;

import designPatterns.exercises.n5_vending.observer.devices.DeviceFacade;
import designPatterns.exercises.n5_vending.observer.menu.Command;
import designPatterns.exercises.n5_vending.observer.utils.LimitedIntDialog;

public class AddCartridgeChargetCommand extends Command {
	
	public AddCartridgeChargetCommand() {
		super("Añadir cartuchos de café");
	}

	@Override
	public void execute() {
		int amount = LimitedIntDialog.instance().read("Cantidad de azucar? ", 100);
		DeviceFacade.instance().addCoffe(amount);
	}

}
