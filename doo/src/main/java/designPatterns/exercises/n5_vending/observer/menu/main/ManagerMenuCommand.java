package designPatterns.exercises.n5_vending.observer.menu.main;

import designPatterns.exercises.n5_vending.observer.menu.Command;
import designPatterns.exercises.n5_vending.observer.menu.manager.ManagerMenu;

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
