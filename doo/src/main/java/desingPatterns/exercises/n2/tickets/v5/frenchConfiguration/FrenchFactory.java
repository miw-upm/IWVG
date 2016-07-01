package desingPatterns.exercises.n2.tickets.v5.frenchConfiguration;

import desingPatterns.exercises.n2.tickets.v5.CountryFactory;

public class FrenchFactory extends CountryFactory {

	public FrenchFactory() {
		this.menu = new FrenchMenu();
		this.ticketBuilder = new FrenchTicketBuilder();
	}
	
}
