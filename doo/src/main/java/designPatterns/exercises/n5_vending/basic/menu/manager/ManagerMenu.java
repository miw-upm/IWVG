package designPatterns.exercises.n5_vending.basic.menu.manager;

import designPatterns.exercises.n5_vending.basic.menu.Menu;

public class ManagerMenu extends Menu {

	public ManagerMenu() {
		commandList.add(new AddCartridgeChargetCommand());
		commandList.add(new AddSugarDepositCommand());
		commandList.add(new AddWateTankCommand());	
	}

}
