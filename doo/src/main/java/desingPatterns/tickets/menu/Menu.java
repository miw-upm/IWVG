package desingPatterns.tickets.menu;

import java.util.List;

import desingPatterns.tickets.components.Line;
import desingPatterns.tickets.utils.IO;
import desingPatterns.tickets.utils.LimitedIntDialog;

public class Menu {

	private List<Command> commands;
	
	private ExitCommand exitCommand;
	
	public Menu(List<Command> commands) {
		this.commands = commands;
		exitCommand = new ExitCommand();
		this.add(exitCommand);
	}

	private void add(Command command) {
		commands.add(command);
	}

	public Line execute() {
		exitCommand.reset();
		for (int i = 0; i < commands.size(); i++) {
			IO.instance().writeln((i + 1) + commands.get(i).getTitle());
		}
		int option = LimitedIntDialog.instance().read("Opción", 1,
				commands.size());
		return commands.get(option).execute();
	}

	public boolean closed() {
		return exitCommand.closed();
	}
}
