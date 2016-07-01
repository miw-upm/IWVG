package desingPatterns.exercises.n2.tickets.v5.ticket;

import desingPatterns.exercises.n2.tickets.v5.visitors.TicketVisitor;

public class SaleLine extends IdLine {

	public SaleLine(int id, int units) {
		super(id, units);
	}
	
	@Override
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
	
	@Override
	public String toString() {
		return "SaleLine " + super.toString();
	}

}
