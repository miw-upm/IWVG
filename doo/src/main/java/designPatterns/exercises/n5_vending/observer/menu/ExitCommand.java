package designPatterns.exercises.n5_vending.observer.menu;

public class ExitCommand extends Command {

	private boolean closed;
	
	public ExitCommand() {
		super("Salir");
		this.reset();
	}

	@Override
	public void execute() {
		closed = true;
	}

	public boolean closed() {
		return closed;
	}
	
	public void reset() {
		closed = false;
	}
}
