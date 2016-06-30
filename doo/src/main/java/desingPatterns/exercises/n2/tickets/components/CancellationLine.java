package desingPatterns.exercises.n2.tickets.components;

public class CancellationLine extends Line {

	private int line;
	
	public CancellationLine(int line) {
		this.line = line;
	}

	@Override
	public void accept(TicketComponentVisitor ticketComponentVisitor) {
		ticketComponentVisitor.visit(this);
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
