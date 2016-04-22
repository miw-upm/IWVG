package desingPatterns.tickets.supermarket;

import desingPatterns.tickets.factories.TicketFactory;
import desingPatterns.tickets.menu.Menu;
import desingPatterns.tickets.store.Store;

public class Supermarket {

	private final static double CLOSING_TIME = 20.0;

	private TicketFactory ticketFactory;

	private Store store;

	private Menu menu;

	private Supermarket() {
		ticketFactory = TicketFactory.instance();
		store = new Store();
		menu = new Menu(ticketFactory.getCommands(store));
		Ticket.set(menu);
	}

	private void sell() {
		boolean late;
		Clock clock = new Clock();
		do {
			Ticket ticket = new Ticket(ticketFactory.getHead(),
					ticketFactory.getFooter());
			ticket.sell();
			late = clock.isNowOrLater(CLOSING_TIME);
		} while (!late);
	}

	public static void main(String[] args) {
		new Supermarket().sell();
	}
}
