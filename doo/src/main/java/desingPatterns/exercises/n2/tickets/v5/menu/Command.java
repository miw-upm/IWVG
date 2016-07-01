package desingPatterns.exercises.n2.tickets.v5.menu;

import desingPatterns.exercises.n2.tickets.v5.ticket.Ticket;

public abstract class Command {

	private String title;
	
	protected Ticket ticket;
	
	protected Command(String title) {
		this.title = title;
	}
	
	public void set(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public String getTitle() {
		return title;
	}
	
	public abstract void execute();

}
