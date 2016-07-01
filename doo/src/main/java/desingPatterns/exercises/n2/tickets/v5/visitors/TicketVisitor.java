package desingPatterns.exercises.n2.tickets.v5.visitors;

import desingPatterns.exercises.n2.tickets.v5.ticket.CancellationLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.Footer;
import desingPatterns.exercises.n2.tickets.v5.ticket.Head;
import desingPatterns.exercises.n2.tickets.v5.ticket.RepetitionLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.ReturnLine;
import desingPatterns.exercises.n2.tickets.v5.ticket.SaleLine;

public interface TicketVisitor {

	void visit(Head head);
	
	void visit(SaleLine saleLine);
	
	void visit(RepetitionLine repetitionLine);
	
	void visit(CancellationLine cancellationLine);
	
	void visit(ReturnLine returnLine);

	void visit(Footer footer);
}
