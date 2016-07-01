package desingPatterns.exercises.n2.tickets.v5.menu;

import desingPatterns.exercises.n2.tickets.v5.ticket.RepetitionLine;
import desingPatterns.exercises.n2.tickets.v5.utils.LimitedIntDialog;

public class RepetitionLineCommand extends Command {

	public RepetitionLineCommand() {
		super("Linea de repetición");
	}

	@Override
	public void execute() {
		int max = ticket.lines();
		int line = LimitedIntDialog.instance().read("Línea", max);
		ticket.add(new RepetitionLine(line));
	}
}
