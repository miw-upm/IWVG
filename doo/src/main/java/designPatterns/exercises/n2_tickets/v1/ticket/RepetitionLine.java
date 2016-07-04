package designPatterns.exercises.n2_tickets.v1.ticket;

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
