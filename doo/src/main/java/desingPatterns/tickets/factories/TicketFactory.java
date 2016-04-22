package desingPatterns.tickets.factories;

import java.util.List;

import desingPatterns.tickets.components.Footer;
import desingPatterns.tickets.components.Head;
import desingPatterns.tickets.menu.Command;
import desingPatterns.tickets.operations.TicketOperation;
import desingPatterns.tickets.store.Store;

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
