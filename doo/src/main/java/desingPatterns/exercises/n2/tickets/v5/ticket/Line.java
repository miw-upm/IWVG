package desingPatterns.exercises.n2.tickets.v5.ticket;

import desingPatterns.exercises.n2.tickets.v5.visitors.TicketVisitor;

public abstract class Line {

	protected int price;
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public abstract void accept(TicketVisitor ticketVisitor);

	@Override
	public String toString() {
		return ", price=" + price;
	}
	
}
