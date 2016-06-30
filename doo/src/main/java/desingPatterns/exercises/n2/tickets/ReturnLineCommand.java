package desingPatterns.exercises.n2.tickets;


public class ReturnLineCommand extends Command {

	private Store store;
	
	public ReturnLineCommand(Store store) {
		super("Linea de devolución");
		this.store = store;
	}

	@Override
	public Line execute() {
		int id = LimitedIntDialog.instance().read("Código", 1000);
		int units = LimitedIntDialog.instance().read("Unidades", 1000);
		return new ReturnLine(id, units, store.getPrice(id, units));
	}
}
