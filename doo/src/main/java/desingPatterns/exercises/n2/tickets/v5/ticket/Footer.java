package desingPatterns.exercises.n2.tickets.v5.ticket;

import desingPatterns.exercises.n2.tickets.v5.visitors.TicketVisitor;

public class Footer {

	private int totalPrice;
	
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}

	public int getTotalPrice() {
		return totalPrice;
	}
	
	@Override
	public String toString() {
		return "Footer [totalPrice=" + totalPrice + "]";
	}
	
}
