package desingPatterns.exercises.n2.tickets.v5.menu;

import desingPatterns.exercises.n2.tickets.v5.ticket.CancellationLine;
import desingPatterns.exercises.n2.tickets.v5.utils.LimitedIntDialog;

public class CancellationLineCommand extends Command {

	public CancellationLineCommand() {
		super("Linea de cancelación");
	}

	@Override
	public void execute() {
		int max = ticket.lines();
		int line = LimitedIntDialog.instance().read("Línea", max);
		ticket.add(new CancellationLine(line));
	}

}
