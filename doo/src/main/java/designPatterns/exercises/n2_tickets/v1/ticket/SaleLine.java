package designPatterns.exercises.n2_tickets.v1.ticket;

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
