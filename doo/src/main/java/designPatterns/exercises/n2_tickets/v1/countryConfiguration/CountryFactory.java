package designPatterns.exercises.n2_tickets.v1.countryConfiguration;

import designPatterns.exercises.n2_tickets.v1.menu.Menu;
import designPatterns.exercises.n2_tickets.v1.spanishConfiguration.SpanishFactory;
import designPatterns.exercises.n2_tickets.v1.ticket.Ticket;

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
