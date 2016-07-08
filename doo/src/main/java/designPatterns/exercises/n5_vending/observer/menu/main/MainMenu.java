package designPatterns.exercises.n5_vending.observer.menu.main;

import designPatterns.exercises.n5_vending.observer.Product;
import designPatterns.exercises.n5_vending.observer.devices.DeviceFacade;
import designPatterns.exercises.n5_vending.observer.menu.ExitCommand;
import designPatterns.exercises.n5_vending.observer.menu.Menu;

public class MainMenu extends Menu {

	private ExitCommand exitCommand;

	public MainMenu() {
		super();
		exitCommand = new ExitCommand();
		this.set();
	}
	
	private void set(){
		System.out.println(DeviceFacade.instance());
		if (DeviceFacade.instance().isActiveVending()){
			this.activeVendingSet();
		} else {
			this.deactiveVendingSet();
		}
	}
	
	private void activeVendingSet() {
		commandList.clear();
		commandList.add(new ProductCommand(new Product("Cafe solo", 1, 1)));
		commandList.add(new ProductCommand(new Product("Cafe con leche", 1, 1)));
		commandList.add(new ProductCommand(new Product("Cafe ole", 1, 1)));
		commandList.add(new ProductCommand(new Product("Cafe capuccino", 1, 1)));
		commandList.add(new ManagerMenuCommand());
		this.commandList.add(exitCommand);
	}
	
	private void deactiveVendingSet() {
		commandList.clear();
		commandList.add(new ManagerMenuCommand());
		this.commandList.add(exitCommand);
	}
	
	public void execute() {
		exitCommand.reset();
		do {
			this.set();
			super.execute();
		} while (!exitCommand.closed());
	}

	public boolean isClosed() {
		return exitCommand.closed();
	}

}
