package desingPatterns.exercises.n2.tickets;


public abstract class Line {

	public abstract void accept(TicketComponentVisitor ticketComponentVisitor);

}
