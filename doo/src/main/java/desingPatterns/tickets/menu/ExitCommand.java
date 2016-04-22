package desingPatterns.tickets.menu;

import desingPatterns.tickets.components.Line;

public class ExitCommand extends Command {

	private boolean closed;
	
	protected ExitCommand() {
		super("Salir");
		this.reset();
	}

	@Override
	public Line execute() {
		closed = true;
		return null;
	}

	public boolean closed() {
		return closed;
	}
	
	public void reset() {
		closed = false;
	}
}
