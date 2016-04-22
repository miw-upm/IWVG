package desingPatterns.tickets.operations;

import desingPatterns.tickets.components.CancellationLine;
import desingPatterns.tickets.components.Footer;
import desingPatterns.tickets.components.Head;
import desingPatterns.tickets.components.RepetitionLine;
import desingPatterns.tickets.components.ReturnLine;
import desingPatterns.tickets.components.SaleLine;

public class BackupOperation extends TicketOperation {

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
