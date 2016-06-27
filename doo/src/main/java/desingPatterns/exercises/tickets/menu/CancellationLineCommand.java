package desingPatterns.exercises.tickets.menu;

import desingPatterns.exercises.tickets.components.CancellationLine;
import desingPatterns.exercises.tickets.components.Line;
import desingPatterns.exercises.tickets.utils.LimitedIntDialog;

public class CancellationLineCommand extends Command {

	public CancellationLineCommand() {
		super("Linea de cancelación");
	}

	@Override
	public Line execute() {
		int line = LimitedIntDialog.instance().read("Línea", 1000);
		return new CancellationLine(line);
	}

}
