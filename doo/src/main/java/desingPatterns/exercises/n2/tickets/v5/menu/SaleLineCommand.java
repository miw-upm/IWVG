package desingPatterns.exercises.n2.tickets.v5.menu;

import desingPatterns.exercises.n2.tickets.v5.ticket.SaleLine;
import desingPatterns.exercises.n2.tickets.v5.utils.LimitedIntDialog;

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
