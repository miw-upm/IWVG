package desingPatterns.tickets.factories.spain;

import java.util.ArrayList;
import java.util.List;

import desingPatterns.tickets.components.Footer;
import desingPatterns.tickets.components.Head;
import desingPatterns.tickets.factories.TicketFactory;
import desingPatterns.tickets.menu.CancellationLineCommand;
import desingPatterns.tickets.menu.Command;
import desingPatterns.tickets.menu.RepetitionLineCommand;
import desingPatterns.tickets.menu.ReturnLineCommand;
import desingPatterns.tickets.menu.SaleLineCommand;
import desingPatterns.tickets.operations.BackupOperation;
import desingPatterns.tickets.operations.PriceCalculatorOperation;
import desingPatterns.tickets.operations.ThreeXTwoOfertOperation;
import desingPatterns.tickets.operations.TicketOperation;
import desingPatterns.tickets.operations.TicketOperationComposite;
import desingPatterns.tickets.store.Store;

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
