package designPatterns.exercises.n2_tickets.v1.menu;

import designPatterns.exercises.n2_tickets.v1.ticket.RepetitionLine;
import designPatterns.exercises.n2_tickets.v1.utils.LimitedIntDialog;

public class RepetitionLineCommand extends Command {

	public RepetitionLineCommand() {
		super("Linea de repetición");
	}

	@Override
	public void execute() {
		int max = ticket.lines();
		int line = LimitedIntDialog.instance().read("Línea? ", max);
		ticket.add(new RepetitionLine(line));
	}
}
