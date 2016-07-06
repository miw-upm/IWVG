package designPatterns.exercises.n2_tickets.v1.ticket;

public interface TicketVisitor {

	void visit(Header head);
	
	void visit(SaleLine saleLine);
	
	void visit(RepetitionLine repetitionLine);
	
	void visit(CancellationLine cancellationLine);
	
	void visit(ReturnLine returnLine);

	void visit(Footer footer);
}
