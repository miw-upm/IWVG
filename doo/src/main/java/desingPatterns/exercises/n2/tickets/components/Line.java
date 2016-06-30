package desingPatterns.exercises.n2.tickets.components;

public abstract class Line {

	public abstract void accept(TicketComponentVisitor ticketComponentVisitor);

}
