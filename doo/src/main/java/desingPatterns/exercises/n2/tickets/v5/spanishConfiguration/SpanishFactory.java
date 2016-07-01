package desingPatterns.exercises.n2.tickets.v5.spanishConfiguration;

import desingPatterns.exercises.n2.tickets.v5.CountryFactory;

public class SpanishFactory extends CountryFactory {

	public SpanishFactory() {
		this.menu = new SpanishMenu();
		this.ticketBuilder = new SpanishTicketBuilder();
	}
	
}
