package desingPatterns.exercises.tickets.operations;

import desingPatterns.exercises.tickets.components.CancellationLine;
import desingPatterns.exercises.tickets.components.Footer;
import desingPatterns.exercises.tickets.components.Head;
import desingPatterns.exercises.tickets.components.RepetitionLine;
import desingPatterns.exercises.tickets.components.ReturnLine;
import desingPatterns.exercises.tickets.components.SaleLine;

public class ThreeXTwoOfertOperation extends TicketOperation {

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
