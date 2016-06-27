package desingPatterns.exercises.tickets.components;

public class Footer {

	public void accept(TicketComponentVisitor ticketComponentVisitor) {
		ticketComponentVisitor.visit(this);
	}
}
