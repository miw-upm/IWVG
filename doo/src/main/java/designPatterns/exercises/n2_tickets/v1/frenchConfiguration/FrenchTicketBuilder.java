package designPatterns.exercises.n2_tickets.v1.frenchConfiguration;

import designPatterns.exercises.n2_tickets.v1.countryConfiguration.TicketBuilder;
import designPatterns.exercises.n2_tickets.v1.operations.ClientPrinterOperation;
import designPatterns.exercises.n2_tickets.v1.operations.PriceCalculatorOperation;
import designPatterns.exercises.n2_tickets.v1.operations.ScreenViewerOperation;
import designPatterns.exercises.n2_tickets.v1.operations.TaxPrinterOperation;
import designPatterns.exercises.n2_tickets.v1.operations.TicketOperationComposite;
import designPatterns.exercises.n2_tickets.v1.ticket.Ticket;

class FrenchTicketBuilder extends TicketBuilder {

	FrenchTicketBuilder() {
		TicketOperationComposite lineTicketOperationComposite = new TicketOperationComposite();
		lineTicketOperationComposite.add(new PriceCalculatorOperation());
		lineTicketOperationComposite.add(new ClientPrinterOperation());
		lineTicketOperationComposite.add(new TaxPrinterOperation());
		lineTicketOperationComposite.add(new ScreenViewerOperation());
		lineTicketOperation = lineTicketOperationComposite;
		TicketOperationComposite globalTicketOperationComposite = new TicketOperationComposite();
		globalTicketOperation = globalTicketOperationComposite;
	}

	@Override
	public Ticket build() {
		Ticket ticket = new Ticket(new FrenchHead(), new FrenchFooter());
		lineTicketOperation.set(ticket);
		globalTicketOperation.set(ticket);
		return ticket;
	}
}
