package designPatterns.exercises.n2_tickets.v1.menu;

import designPatterns.exercises.n2_tickets.v1.ticket.ReturnLine;
import designPatterns.exercises.n2_tickets.v1.utils.LimitedIntDialog;

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
