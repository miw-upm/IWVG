package desingPatterns.exercises.n2.tickets.v5.ticket;

import java.util.Date;

import desingPatterns.exercises.n2.tickets.v5.visitors.TicketVisitor;

public class Head {

	private Date date;
	
	public Head() {
		date = new Date();
	}
	
	public Date getDate() {
		return date;
	}
	
	public void accept(TicketVisitor ticketVisitor) {
		ticketVisitor.visit(this);
	}

	@Override
	public String toString() {
		return "Head [date=" + date + "]";
	}
	
}
