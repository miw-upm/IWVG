package desingPatterns.exercises.n2.tickets.v5.frenchConfiguration;

import desingPatterns.exercises.n2.tickets.v5.ticket.Ticket;
import desingPatterns.exercises.n2.tickets.v5.ticket.TicketBuilder;
import desingPatterns.exercises.n2.tickets.v5.visitors.ClientPrinterOperation;
import desingPatterns.exercises.n2.tickets.v5.visitors.PriceCalculatorOperation;
import desingPatterns.exercises.n2.tickets.v5.visitors.ScreenViewerOperation;
import desingPatterns.exercises.n2.tickets.v5.visitors.TaxPrinterOperation;
import desingPatterns.exercises.n2.tickets.v5.visitors.TicketOperationComposite;

class FrenchTicketBuilder extends TicketBuilder {

	FrenchTicketBuilder() {
		TicketOperationComposite lineTicketOperationComposite = new TicketOperationComposite();
		lineTicketOperationComposite.add(new PriceCalculatorOperation(null));
		lineTicketOperationComposite.add(new ClientPrinterOperation());
		lineTicketOperationComposite.add(new TaxPrinterOperation());
		lineTicketOperationComposite.add(new ScreenViewerOperation());
		lineTicketOperation = lineTicketOperationComposite;
		TicketOperationComposite globalTicketOperationComposite = new TicketOperationComposite();
		globalTicketOperation = globalTicketOperationComposite;
	}

	@Override
	public Ticket build() {
		Ticket ticket = new Ticket(new FrenchHead(), new FrenchFooter(),
				lineTicketOperation, globalTicketOperation);
		lineTicketOperation.set(ticket);
		globalTicketOperation.set(ticket);
		return ticket;
	}
}
