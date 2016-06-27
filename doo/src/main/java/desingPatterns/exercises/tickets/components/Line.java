package desingPatterns.exercises.tickets.components;

public abstract class Line {

	public abstract void accept(TicketComponentVisitor ticketComponentVisitor);

}
