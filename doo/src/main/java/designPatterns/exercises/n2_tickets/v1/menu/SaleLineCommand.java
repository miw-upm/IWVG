package designPatterns.exercises.n2_tickets.v1.menu;

import designPatterns.exercises.n2_tickets.v1.ticket.SaleLine;
import designPatterns.exercises.n2_tickets.v1.utils.LimitedIntDialog;

public class SaleLineCommand extends Command {

	public SaleLineCommand() {
		super("Linea de venta");
	}

	@Override
	public void execute() {
		int id = LimitedIntDialog.instance().read("Código", 1000);
		int units = LimitedIntDialog.instance().read("Unidades", 1000);
		ticket.add(new SaleLine(id, units));
	}
}
