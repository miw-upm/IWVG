package designPatterns.patterns.command;

public class Invoker {

	public void execute(Command command) {
		command.execute();
	}
}
