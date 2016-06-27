package desingPatterns.exercises.tickets.factories;

import java.util.List;

import desingPatterns.exercises.tickets.components.Footer;
import desingPatterns.exercises.tickets.components.Head;
import desingPatterns.exercises.tickets.menu.Command;
import desingPatterns.exercises.tickets.operations.TicketOperation;
import desingPatterns.exercises.tickets.store.Store;

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
