package designPatterns.exercises.n2_tickets.v1.menu;

import designPatterns.exercises.n2_tickets.v1.ticket.CancellationLine;
import designPatterns.exercises.n2_tickets.v1.utils.LimitedIntDialog;

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
