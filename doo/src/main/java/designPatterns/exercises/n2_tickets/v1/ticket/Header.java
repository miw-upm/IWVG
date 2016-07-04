package designPatterns.exercises.n2_tickets.v1.ticket;

import java.util.Date;

public class Header {

	private Date date;
	
	public Header() {
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
