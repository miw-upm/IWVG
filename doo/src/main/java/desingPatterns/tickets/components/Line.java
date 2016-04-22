package desingPatterns.tickets.components;

public abstract class Line {

	public abstract void accept(TicketComponentVisitor ticketComponentVisitor);

}
