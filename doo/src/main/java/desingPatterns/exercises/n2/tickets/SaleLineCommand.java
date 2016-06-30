package desingPatterns.exercises.n2.tickets;


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
