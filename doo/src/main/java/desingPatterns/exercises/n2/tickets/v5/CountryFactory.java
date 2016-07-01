package desingPatterns.exercises.n2.tickets.v5;

import desingPatterns.exercises.n2.tickets.v5.menu.Menu;
import desingPatterns.exercises.n2.tickets.v5.spanishConfiguration.SpanishFactory;
import desingPatterns.exercises.n2.tickets.v5.ticket.Ticket;
import desingPatterns.exercises.n2.tickets.v5.ticket.TicketBuilder;

public abstract class CountryFactory {

	private static CountryFactory countryFactory;
	
	public static CountryFactory instance() {
		if (countryFactory == null) {
			//TODO leer de configuración
			countryFactory = new SpanishFactory();
		}
		return countryFactory;
	}
	
	protected Menu menu;
	
	protected TicketBuilder ticketBuilder;
	
	public Ticket getTicket() {
		return ticketBuilder.build();
	}
	
	public Menu getMenu() {
		return menu;
	}
}
