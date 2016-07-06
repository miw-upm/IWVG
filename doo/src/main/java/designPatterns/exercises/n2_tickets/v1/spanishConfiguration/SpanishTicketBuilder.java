package designPatterns.exercises.n2_tickets.v1.spanishConfiguration;

import designPatterns.exercises.n2_tickets.v1.countryConfiguration.TicketBuilder;
import designPatterns.exercises.n2_tickets.v1.operations.ClientPrinterOperation;
import designPatterns.exercises.n2_tickets.v1.operations.PriceCalculatorOperation;
import designPatterns.exercises.n2_tickets.v1.operations.TaxPrinterOperation;
import designPatterns.exercises.n2_tickets.v1.operations.TicketOperationComposite;
import designPatterns.exercises.n2_tickets.v1.ticket.Ticket;

class SpanishTicketBuilder extends TicketBuilder {

	SpanishTicketBuilder() {
		TicketOperationComposite lineTicketOperationComposite = new TicketOperationComposite();
		lineTicketOperationComposite.add(new PriceCalculatorOperation());
		lineTicketOperationComposite.add(new ClientPrinterOperation());
		lineTicketOperationComposite.add(new TaxPrinterOperation());
		lineTicketOperation = lineTicketOperationComposite;
		TicketOperationComposite globalTicketOperationComposite = new TicketOperationComposite();
		lineTicketOperationComposite.add(new PriceCalculatorOperation());
		lineTicketOperationComposite.add(new ClientPrinterOperation());
		lineTicketOperationComposite.add(new TaxPrinterOperation());
		globalTicketOperation = globalTicketOperationComposite;
	}

	@Override
	public Ticket build() {
		Ticket ticket = new Ticket(new SpanishHead(), new SpanishFooter());
		ticket.setLineTicketOperation(lineTicketOperation);
		ticket.setGlobalTicketOperation(lineTicketOperation);
		lineTicketOperation.set(ticket);
		globalTicketOperation.set(ticket);
		return ticket;
	}
}
