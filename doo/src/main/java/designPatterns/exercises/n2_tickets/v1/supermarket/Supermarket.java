package designPatterns.exercises.n2_tickets.v1.supermarket;

import designPatterns.exercises.n2_tickets.v1.countryConfiguration.CountryFactory;
import designPatterns.exercises.n2_tickets.v1.menu.Menu;
import designPatterns.exercises.n2_tickets.v1.ticket.Ticket;
import designPatterns.exercises.n2_tickets.v1.utils.Clock;

public class Supermarket {

	private final static double CLOSING_TIME = 20.0;

	private Menu menu;

	private Supermarket() {
		menu = CountryFactory.instance().getMenu();
	}

	private void sell() {
		Clock clock = new Clock();
		do {
			Ticket ticket = CountryFactory.instance().getTicket();
			menu.execute(ticket);
			ticket.close();
		} while (!clock.isNowOrLater(CLOSING_TIME));
	}

	public static void main(String[] args) {
		new Supermarket().sell();
	}
}
