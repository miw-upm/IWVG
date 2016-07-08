package designPatterns.exercises.n5_vending.basic.menu.main;

import designPatterns.exercises.n5_vending.basic.menu.Command;
import designPatterns.exercises.n5_vending.basic.menu.manager.ManagerMenu;

public class ManagerMenuCommand extends Command {
	
	public ManagerMenuCommand() {
		super("Gestión");
	}
	
	@Override
	public void execute() {
		ManagerMenu managerMenu = new ManagerMenu();
		managerMenu.execute();
	}

}
