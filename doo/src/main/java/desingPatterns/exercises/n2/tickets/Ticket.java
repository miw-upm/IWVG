package desingPatterns.exercises.n2.tickets;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	
	private static Menu menu;
	
	public static void set(Menu menu) {
		Ticket.menu = menu;
	}

	private Head head;
	
	private List<Line> lines;
	
	private Footer footer;
	
	public Ticket(Head head, Footer footer){
		this.head = head;
		lines = new ArrayList<Line>();
		this.footer = footer;
	}
	
	public void sell() {
		do {
			Line line = menu.execute();
			if (line != null) {
				lines.add(line);
			}
		} while(!menu.closed());
		this.accept(TicketFactory.instance().getOperation());
	}
	
	private void accept(TicketOperation ticketOperation) {
		head.accept(ticketOperation);
		for(Line line : lines) {
			line.accept(ticketOperation);
		}
		footer.accept(ticketOperation);
	}

}
