package desingPatterns.exercises.n2.tickets;

import java.util.ArrayList;
import java.util.List;

public class SpanishTicketFactory extends TicketFactory {

	public SpanishTicketFactory() {
		super();
	}

	@Override
	public Head getHead() {
		return new SpanishHead();
	}

	@Override
	public Footer getFooter() {
		return new SpanishFooter();
	}

	@Override
	public List<Command> getCommands(Store store) {
		List<Command> commands = new ArrayList<Command>();
		commands.add(new SaleLineCommand(store));
		commands.add(new RepetitionLineCommand());
		commands.add(new CancellationLineCommand());
		commands.add(new ReturnLineCommand(store));
		return commands;
	}

	@Override
	public TicketOperation getOperation() {
		TicketOperationComposite ticketOperationComposite = new TicketOperationComposite();
		ticketOperationComposite.add(new ThreeXTwoOfertOperation());
		ticketOperationComposite.add(new PriceCalculatorOperation());
		ticketOperationComposite.add(new BackupOperation());
		return ticketOperationComposite;
	}
}
