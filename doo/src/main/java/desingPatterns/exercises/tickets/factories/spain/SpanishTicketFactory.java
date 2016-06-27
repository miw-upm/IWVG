package desingPatterns.exercises.tickets.factories.spain;

import java.util.ArrayList;
import java.util.List;

import desingPatterns.exercises.tickets.components.Footer;
import desingPatterns.exercises.tickets.components.Head;
import desingPatterns.exercises.tickets.factories.TicketFactory;
import desingPatterns.exercises.tickets.menu.CancellationLineCommand;
import desingPatterns.exercises.tickets.menu.Command;
import desingPatterns.exercises.tickets.menu.RepetitionLineCommand;
import desingPatterns.exercises.tickets.menu.ReturnLineCommand;
import desingPatterns.exercises.tickets.menu.SaleLineCommand;
import desingPatterns.exercises.tickets.operations.BackupOperation;
import desingPatterns.exercises.tickets.operations.PriceCalculatorOperation;
import desingPatterns.exercises.tickets.operations.ThreeXTwoOfertOperation;
import desingPatterns.exercises.tickets.operations.TicketOperation;
import desingPatterns.exercises.tickets.operations.TicketOperationComposite;
import desingPatterns.exercises.tickets.store.Store;

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
