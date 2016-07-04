package designPatterns.patterns.command;

public class ConcreteCommandA extends Command {

	public ConcreteCommandA(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void execute() {
		receiver.action1();
	}

}
