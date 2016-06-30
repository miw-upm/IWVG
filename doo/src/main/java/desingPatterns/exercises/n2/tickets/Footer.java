package desingPatterns.exercises.n2.tickets;


public class Footer {

	public void accept(TicketComponentVisitor ticketComponentVisitor) {
		ticketComponentVisitor.visit(this);
	}
}
