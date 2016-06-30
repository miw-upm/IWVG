package desingPatterns.exercises.n2.tickets.components;

public class Footer {

	public void accept(TicketComponentVisitor ticketComponentVisitor) {
		ticketComponentVisitor.visit(this);
	}
}
