package desingPatterns.exercises.n2.tickets.v5.spanishConfiguration;

import desingPatterns.exercises.n2.tickets.v5.ticket.Ticket;
import desingPatterns.exercises.n2.tickets.v5.ticket.TicketBuilder;
import desingPatterns.exercises.n2.tickets.v5.visitors.ClientPrinterOperation;
import desingPatterns.exercises.n2.tickets.v5.visitors.PriceCalculatorOperation;
import desingPatterns.exercises.n2.tickets.v5.visitors.TaxPrinterOperation;
import desingPatterns.exercises.n2.tickets.v5.visitors.TicketOperationComposite;

class SpanishTicketBuilder extends TicketBuilder {

	SpanishTicketBuilder() {
		TicketOperationComposite lineTicketOperationComposite = new TicketOperationComposite();
		lineTicketOperationComposite.add(new PriceCalculatorOperation(null));
		lineTicketOperationComposite.add(new ClientPrinterOperation());
		lineTicketOperationComposite.add(new TaxPrinterOperation());
		lineTicketOperation = lineTicketOperationComposite;
		TicketOperationComposite globalTicketOperationComposite = new TicketOperationComposite();
		lineTicketOperationComposite.add(new PriceCalculatorOperation(null));
		lineTicketOperationComposite.add(new ClientPrinterOperation());
		lineTicketOperationComposite.add(new TaxPrinterOperation());
		globalTicketOperation = globalTicketOperationComposite;
	}

	@Override
	public Ticket build() {
		Ticket ticket = new Ticket(new SpanishHead(), new SpanishFooter(),
				lineTicketOperation, globalTicketOperation);
		lineTicketOperation.set(ticket);
		globalTicketOperation.set(ticket);
		return ticket;
	}
}
