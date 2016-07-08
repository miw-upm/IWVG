package designPatterns.exercises.n5_vending.basic.menu.manager;

import designPatterns.exercises.n5_vending.basic.devices.DeviceFacade;
import designPatterns.exercises.n5_vending.basic.menu.Command;
import designPatterns.exercises.n5_vending.basic.utils.LimitedIntDialog;

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
