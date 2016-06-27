package desingPatterns.exercises.tickets.components;

public interface TicketComponentVisitor {

	void visit(Head head);
	
	void visit(SaleLine line);
	
	void visit(RepetitionLine line);
	
	void visit(CancellationLine line);
	
	void visit(ReturnLine line);

	void visit(Footer footer);
}
