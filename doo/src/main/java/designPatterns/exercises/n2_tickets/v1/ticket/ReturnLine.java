package designPatterns.exercises.n2_tickets.v1.ticket;

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
