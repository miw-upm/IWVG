package designPatterns.exercises.n5_vending.basic.menu;

import java.util.ArrayList;
import java.util.List;

import designPatterns.exercises.n5_vending.basic.utils.IO;
import designPatterns.exercises.n5_vending.basic.utils.LimitedIntDialog;

public abstract class Menu {

	protected List<Command> commandList;

	public Menu() {
		this.commandList = new ArrayList<Command>();
	}
	
	public void execute() {
		this.write();
		int option = this.getOption();
		commandList.get(option).execute();
	}
	
	protected void write() {
		IO.instance().writeln();
		IO.instance().writeln();
		IO.instance().writeln("---------------------");
		for (int i = 0; i < commandList.size(); i++) {
			IO.instance().writeln(
					(i + 1) + ". " + commandList.get(i).getTitle());
		}
	}
	
	protected int getOption() {
		return LimitedIntDialog.instance()
				.read("Opción", 1, commandList.size())-1;
	}

}
