package desingPatterns.exercises.n2.tickets.factories.spain;

import java.util.ArrayList;
import java.util.List;

import desingPatterns.exercises.n2.tickets.components.Footer;
import desingPatterns.exercises.n2.tickets.components.Head;
import desingPatterns.exercises.n2.tickets.factories.TicketFactory;
import desingPatterns.exercises.n2.tickets.menu.CancellationLineCommand;
import desingPatterns.exercises.n2.tickets.menu.Command;
import desingPatterns.exercises.n2.tickets.menu.RepetitionLineCommand;
import desingPatterns.exercises.n2.tickets.menu.ReturnLineCommand;
import desingPatterns.exercises.n2.tickets.menu.SaleLineCommand;
import desingPatterns.exercises.n2.tickets.operations.BackupOperation;
import desingPatterns.exercises.n2.tickets.operations.PriceCalculatorOperation;
import desingPatterns.exercises.n2.tickets.operations.ThreeXTwoOfertOperation;
import desingPatterns.exercises.n2.tickets.operations.TicketOperation;
import desingPatterns.exercises.n2.tickets.operations.TicketOperationComposite;
import desingPatterns.exercises.n2.tickets.store.Store;

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
