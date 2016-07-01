package desingPatterns.exercises.n2.tickets.v5.visitors;

import desingPatterns.exercises.n2.tickets.v5.ticket.CancellationLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.Footer;
import desingPatterns.exercises.n2.tickets.v5.ticket.Head;
import desingPatterns.exercises.n2.tickets.v5.ticket.RepetitionLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.ReturnLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.SaleLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.Ticket;

public class TicketOperation implements TicketVisitor {

	protected Ticket ticket;
	
	public void set(Ticket ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public void visit(Head head) {
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
