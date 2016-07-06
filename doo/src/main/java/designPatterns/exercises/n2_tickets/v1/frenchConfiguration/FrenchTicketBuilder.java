package designPatterns.exercises.n2_tickets.v1.frenchConfiguration;

import designPatterns.exercises.n2_tickets.v1.countryConfiguration.TicketBuilder;
import designPatterns.exercises.n2_tickets.v1.operations.PriceCalculatorOperation;
import designPatterns.exercises.n2_tickets.v1.operations.TaxPrinterOperation;
import designPatterns.exercises.n2_tickets.v1.operations.TicketOperationComposite;
import designPatterns.exercises.n2_tickets.v1.ticket.Ticket;

class FrenchTicketBuilder extends TicketBuilder {

	FrenchTicketBuilder() {
		lineTicketOperation = new PriceCalculatorOperation();
		TicketOperationComposite globalTicketOperationComposite = new TicketOperationComposite();
		globalTicketOperationComposite.add(new PriceCalculatorOperation());
		globalTicketOperationComposite.add(new TaxPrinterOperation());
		globalTicketOperation = globalTicketOperationComposite;
	}

	@Override
	public Ticket build() {
		Ticket ticket = new Ticket(new FrenchHead(), new FrenchFooter());
		ticket.setLineTicketOperation(lineTicketOperation);
		ticket.setGlobalTicketOperation(lineTicketOperation);
		lineTicketOperation.set(ticket);
		globalTicketOperation.set(ticket);
		return ticket;
	}
}
