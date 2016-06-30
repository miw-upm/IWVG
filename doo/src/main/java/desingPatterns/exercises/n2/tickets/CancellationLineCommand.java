package desingPatterns.exercises.n2.tickets;


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
