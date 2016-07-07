package designPatterns.exercises.n2_tickets.v1.countryConfiguration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import designPatterns.exercises.n2_tickets.v1.menu.Menu;
import designPatterns.exercises.n2_tickets.v1.ticket.Ticket;

public abstract class CountryFactory {

	private static CountryFactory countryFactory;

	public static CountryFactory instance() {
		if (countryFactory == null) {
			String line = CountryFactory.getSingletonConfigure();
			try {
				countryFactory = (CountryFactory) (Class
						.forName(line).newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return countryFactory;
	}

	private static String getSingletonConfigure() {
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader("tickets"));
			line = in.readLine().substring(13);
		} catch (IOException ex) {
			System.out.println("IOException al leer: " + ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: "
							+ ex.getMessage());
				}
			}
		}
		return line;
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
