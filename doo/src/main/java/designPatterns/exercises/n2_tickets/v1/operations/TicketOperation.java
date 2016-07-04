package designPatterns.exercises.n2_tickets.v1.operations;

import designPatterns.exercises.n2_tickets.v1.ticket.CancellationLine;
import designPatterns.exercises.n2_tickets.v1.ticket.Footer;
import designPatterns.exercises.n2_tickets.v1.ticket.Header;
import designPatterns.exercises.n2_tickets.v1.ticket.RepetitionLine;
import designPatterns.exercises.n2_tickets.v1.ticket.ReturnLine;
import designPatterns.exercises.n2_tickets.v1.ticket.SaleLine;
import designPatterns.exercises.n2_tickets.v1.ticket.Ticket;
import designPatterns.exercises.n2_tickets.v1.ticket.TicketVisitor;

public abstract class TicketOperation implements TicketVisitor {

	protected Ticket ticket;
	
	public void set(Ticket ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public void visit(Header head) {
	}

	@Override
	public void visit(SaleLine saleLine) {
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
	}

	@Override
	public void visit(ReturnLine returnLine) {
	}

	@Override
	public void visit(Footer footer) {
	}

}
