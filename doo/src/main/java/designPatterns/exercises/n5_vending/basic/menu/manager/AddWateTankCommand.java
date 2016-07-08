package designPatterns.exercises.n5_vending.basic.menu.manager;

import designPatterns.exercises.n5_vending.basic.devices.DeviceFacade;
import designPatterns.exercises.n5_vending.basic.menu.Command;
import designPatterns.exercises.n5_vending.basic.utils.LimitedIntDialog;

public class AddWateTankCommand extends Command {

	public AddWateTankCommand() {
		super("Añadir agua");
	}

	@Override
	public void execute() {
		int amount = LimitedIntDialog.instance().read("Cantidad de azucar? ", 100);
		DeviceFacade.instance().addWater(amount);
	}


}
