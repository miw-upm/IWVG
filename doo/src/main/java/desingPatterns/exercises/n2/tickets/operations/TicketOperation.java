package desingPatterns.exercises.n2.tickets.operations;

import desingPatterns.exercises.n2.tickets.components.CancellationLine;
import desingPatterns.exercises.n2.tickets.components.Footer;
import desingPatterns.exercises.n2.tickets.components.Head;
import desingPatterns.exercises.n2.tickets.components.RepetitionLine;
import desingPatterns.exercises.n2.tickets.components.ReturnLine;
import desingPatterns.exercises.n2.tickets.components.SaleLine;
import desingPatterns.exercises.n2.tickets.components.TicketComponentVisitor;

public class TicketOperation implements TicketComponentVisitor {

	@Override
	public void visit(Head head) {
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
