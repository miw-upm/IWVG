package desingPatterns.exercises.tickets.menu;

import desingPatterns.exercises.tickets.components.Line;

class ExitCommand extends Command {

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
