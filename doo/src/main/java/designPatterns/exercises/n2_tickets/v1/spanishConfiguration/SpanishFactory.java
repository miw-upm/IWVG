package designPatterns.exercises.n2_tickets.v1.spanishConfiguration;

import designPatterns.exercises.n2_tickets.v1.countryConfiguration.CountryFactory;

public class SpanishFactory extends CountryFactory {

	public SpanishFactory() {
		this.menu = new SpanishMenu();
		this.ticketBuilder = new SpanishTicketBuilder();
	}
	
}
