package desingPatterns.tickets.menu;

import desingPatterns.tickets.components.Line;
import desingPatterns.tickets.components.RepetitionLine;
import desingPatterns.tickets.utils.LimitedIntDialog;

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
