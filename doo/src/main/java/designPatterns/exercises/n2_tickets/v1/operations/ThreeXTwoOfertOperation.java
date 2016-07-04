package designPatterns.exercises.n2_tickets.v1.operations;

import designPatterns.exercises.n2_tickets.v1.ticket.CancellationLine;
import designPatterns.exercises.n2_tickets.v1.ticket.Footer;
import designPatterns.exercises.n2_tickets.v1.ticket.Header;
import designPatterns.exercises.n2_tickets.v1.ticket.RepetitionLine;
import designPatterns.exercises.n2_tickets.v1.ticket.ReturnLine;
import designPatterns.exercises.n2_tickets.v1.ticket.SaleLine;


public class ThreeXTwoOfertOperation extends TicketOperation {

	@Override
	public void visit(Header head) {
	}

	@Override
	public void visit(SaleLine line) {
	}

	@Override
	public void visit(RepetitionLine line) {
	}

	@Override
	public void visit(CancellationLine line) {
	}

	@Override
	public void visit(ReturnLine line) {
	}

	@Override
	public void visit(Footer footer) {
	}
}
