package desingPatterns.exercises.n2.tickets.v5.ticket;

import desingPatterns.exercises.n2.tickets.v5.visitors.TicketOperation;

public abstract class TicketBuilder {

	private static TicketBuilder ticketBuilder;

	public static TicketBuilder instance() {
		if (ticketBuilder == null) {
			// ficher configuración
			String nameTicketBuilder = "desingPatterns.exercises.n2.tickets.v5.spanishConfiguration.SpanishTicketBuilder";
			try {
				ticketBuilder = (TicketBuilder) Class
						.forName(nameTicketBuilder).newInstance();
			} catch (Exception ex) {
				System.out.println("TicketBuilder desconocido");
				ex.printStackTrace();
				System.exit(0);
			}
		}
		return ticketBuilder;
	}
	
	protected TicketOperation lineTicketOperation;
	
	protected TicketOperation globalTicketOperation;

	public abstract Ticket build();
}
