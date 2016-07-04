package designPatterns.exercises.n2_tickets.v1.frenchConfiguration;

import designPatterns.exercises.n2_tickets.v1.countryConfiguration.CountryFactory;

public class FrenchFactory extends CountryFactory {

	public FrenchFactory() {
		this.menu = new FrenchMenu();
		this.ticketBuilder = new FrenchTicketBuilder();
	}
	
}
