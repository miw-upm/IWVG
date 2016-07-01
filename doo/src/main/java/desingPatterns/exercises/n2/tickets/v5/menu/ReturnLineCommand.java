package desingPatterns.exercises.n2.tickets.v5.menu;

import desingPatterns.exercises.n2.tickets.v5.ticket.ReturnLine;
import desingPatterns.exercises.n2.tickets.v5.utils.LimitedIntDialog;

public class ReturnLineCommand extends Command {

	public ReturnLineCommand() {
		super("Linea de devolución");
	}

	@Override
	public void execute() {
		int id = LimitedIntDialog.instance().read("Código", 1000);
		int units = LimitedIntDialog.instance().read("Unidades", 1000);
		ticket.add(new ReturnLine(id, units));
	}
}
