package designPatterns.patterns.command;

public class ConcreteCommandB extends Command {

	public ConcreteCommandB(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void execute() {
		receiver.action2();
	}

}
