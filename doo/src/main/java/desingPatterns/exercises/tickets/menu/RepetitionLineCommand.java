package desingPatterns.exercises.tickets.menu;

import desingPatterns.exercises.tickets.components.Line;
import desingPatterns.exercises.tickets.components.RepetitionLine;
import desingPatterns.exercises.tickets.utils.LimitedIntDialog;

public class RepetitionLineCommand extends Command {

	public RepetitionLineCommand() {
		super("Linea de repetición");
	}

	@Override
	public Line execute() {
		int line = LimitedIntDialog.instance().read("Línea", 1000);
		return new RepetitionLine(line);
	}
}
