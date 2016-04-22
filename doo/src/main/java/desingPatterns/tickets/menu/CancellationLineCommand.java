package desingPatterns.tickets.menu;

import desingPatterns.tickets.components.CancellationLine;
import desingPatterns.tickets.components.Line;
import desingPatterns.tickets.utils.LimitedIntDialog;

public class CancellationLineCommand extends Command {

	public CancellationLineCommand() {
		super("Linea de cancelación");
	}

	@Override
	public Line execute() {
		int line = LimitedIntDialog.instance().read("Línea", 1000);
		return new CancellationLine(line);
	}

}
