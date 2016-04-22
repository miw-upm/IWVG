package desingPatterns.tickets.components;

public class RepetitionLine extends Line {

	private int line;
	
	public RepetitionLine(int line) {
		this.line = line;
	}

	@Override
	public void accept(TicketComponentVisitor ticketComponentVisitor) {
		ticketComponentVisitor.visit(this);
	}
}
