package desingPatterns.exercises.n2.tickets.v5.ticket;

import desingPatterns.exercises.n2.tickets.v5.visitors.TicketVisitor;

public class ReturnLine extends IdLine {

	public ReturnLine(int id, int units) {
		super(id, units);
	}
	
	@Override
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
	
	@Override
	public String toString() {
		return "ReturnLine " + super.toString();
	}
		
}
