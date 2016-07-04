package designPatterns.exercises.n2_tickets.v1.ticket;


public class CancellationLine extends NumberLine {
	
	public CancellationLine(int number) {
		super(number);
	}
	
	@Override
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
	
	@Override
	public String toString() {
		return "CancellationLine " + super.toString();
	}
	
}
