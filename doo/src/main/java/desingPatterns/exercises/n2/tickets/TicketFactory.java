package desingPatterns.exercises.n2.tickets;

import java.util.List;

public abstract class TicketFactory {

	private static TicketFactory ticketFactory;

	public static TicketFactory instance() {
		if (ticketFactory == null) {
			String country = null;
			// leer el pais de un fichero de configuración
			try {
				ticketFactory = (TicketFactory) Class.forName(
						"designPatterns.supermarket." + country).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ticketFactory;
	}

	public abstract Head getHead();

	public abstract Footer getFooter();

	public abstract List<Command> getCommands(Store store);

	public abstract TicketOperation getOperation();

}
