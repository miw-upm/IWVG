package desingPatterns.tickets.components;

public class CancellationLine extends Line {

	private int line;
	
	public CancellationLine(int line) {
		this.line = line;
	}

	@Override
	public void accept(TicketComponentVisitor ticketComponentVisitor) {
		ticketComponentVisitor.visit(this);
	}
}
