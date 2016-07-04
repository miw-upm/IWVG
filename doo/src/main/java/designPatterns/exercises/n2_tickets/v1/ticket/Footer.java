package designPatterns.exercises.n2_tickets.v1.ticket;


public class Footer {

	private int totalPrice;
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}
	
	@Override
	public String toString() {
		return "Footer [totalPrice=" + totalPrice + "]";
	}
	
}
