package desingPatterns.exercises.tickets.menu;

import desingPatterns.exercises.tickets.components.Line;
import desingPatterns.exercises.tickets.components.SaleLine;
import desingPatterns.exercises.tickets.store.Store;
import desingPatterns.exercises.tickets.utils.LimitedIntDialog;

public class SaleLineCommand extends Command {

	private Store store;
	
	public SaleLineCommand(Store store) {
		super("Linea de venta");
		this.store = store;
	}

	@Override
	public Line execute() {
		int id = LimitedIntDialog.instance().read("Código", 1000);
		int units = LimitedIntDialog.instance().read("Unidades", 1000);
		return new SaleLine(id, units, store.getPrice(id, units));
	}
}
