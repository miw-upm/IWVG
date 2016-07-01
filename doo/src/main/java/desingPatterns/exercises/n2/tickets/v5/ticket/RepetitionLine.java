package desingPatterns.exercises.n2.tickets.v5.ticket;

import desingPatterns.exercises.n2.tickets.v5.visitors.TicketVisitor;

public class RepetitionLine extends NumberLine {

	public RepetitionLine(int number) {
		super(number);
	}
	
	@Override
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
	
	@Override
	public String toString() {
		return "RepetitionLine " + super.toString();
	}
	
}
